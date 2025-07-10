class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int one_count=0;
        int ans=0;

        for(int i=0;i<nums.size();i++){
            if(nums[i]==1)
                one_count++;
            else
                one_count=0;
            ans=max(one_count,ans);
        }
        
        return ans;
    }
};