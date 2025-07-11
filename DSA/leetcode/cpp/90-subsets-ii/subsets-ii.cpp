class Solution {
public:
    vector<vector<int>> ans;

    void powerSet(vector<int>& nums,vector<int> tmp,int index,int size){
        ans.push_back(tmp);
        
        for(int i=index;i<size;i++){
            if(i!=index and nums[i]==nums[i-1])
                continue;
            tmp.push_back(nums[i]);
            powerSet(nums,tmp,i+1,size);
            tmp.pop_back();
        }
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<int> tmp;
        powerSet(nums,tmp,0,nums.size());

        return ans;
    }
};