class Solution {
public: 
    vector<vector<int>> ans;
    void findCombination(vector<int>& candidates,int target,int index,int size,vector<int> tmp){
        if(target==0){
            ans.push_back(tmp);
            return ;
        }
        if(index==size or target<0){
            return ;
        }
        
        for(int i=index;i<size;i++){
            if(i!=index and candidates[i]==candidates[i-1])
                continue;
            tmp.push_back(candidates[i]);
            findCombination(candidates,target-candidates[i],i+1,size,tmp);
            tmp.pop_back();
        }
       
       
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        vector<int> tmp;
        findCombination(candidates,target,0,candidates.size(),tmp);

        return ans;
    }
};