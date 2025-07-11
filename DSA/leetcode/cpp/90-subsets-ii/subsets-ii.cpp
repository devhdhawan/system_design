class Solution {
public:
    vector<vector<int>> ans;
    void powerSet(vector<int>& nums,vector<int> tmp,int index,int size){
            if(index>=size)
                return;
            
           
            powerSet(nums,tmp,index+1,size);

           
            tmp.push_back(nums[index]);

            powerSet(nums,tmp,index+1,size);

             ans.push_back(tmp);
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<int> tmp;
        ans.push_back(tmp);
        sort(nums.begin(),nums.end());
        powerSet(nums,tmp,0,nums.size());

        sort(ans.begin(),ans.end());

        for(int i=1;i<ans.size();i++){
            while(ans[i]==ans[i-1]){
                ans.erase(ans.begin()+i);   

            }
        }
        return ans;


    }
};