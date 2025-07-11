class Solution {
public:
    vector<vector<int>> ans;

    void findCombinations(vector<int>& candidates,int target,int index,int size,vector<int> tmp){
        if(index==size){
            if(target==0)
                ans.push_back(tmp);
            return;
        }

        if(candidates[index]<=target){
            tmp.push_back(candidates[index]);
            findCombinations(candidates,target-candidates[index],index,size,tmp);
            tmp.pop_back();
        }

        findCombinations(candidates,target,index+1,size,tmp);
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<int> tmp;
        findCombinations(candidates,target,0,candidates.size(),tmp);

        return ans;
    }
};