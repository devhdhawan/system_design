class Solution {
public:
    vector<vector<int>> ans;

    void sum(vector<int>& candidates,int target,int index,int size,vector<int> tmp){
                if(target==0){
                    ans.push_back(tmp);
                    return ;
                }
                if(index>=size)
                    return;
                
                if(target<0)
                    return ;
                
                int len=target/candidates[index];
                vector<int> tmp2=tmp;
                int sum2=0;
                for(int i=0;i<len;i++){
                    tmp2.push_back(candidates[index]);
                    sum2=sum2+candidates[index];
                    sum(candidates,target-sum2,index+1,size,tmp2);
                }
                
               
                sum(candidates,target,index+1,size,tmp);
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<int> tmp;
        sum(candidates,target,0,candidates.size(),tmp);

        return ans;
    }
};