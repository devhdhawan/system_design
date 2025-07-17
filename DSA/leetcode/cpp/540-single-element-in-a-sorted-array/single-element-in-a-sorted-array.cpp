class Solution {
public:
    int solve(vector<int>& nums,int l,int r,int size){
        if(size==1)
            return nums[l];
        int m=(l+r)/2;

        if((m==0 and nums[m]!=nums[m+1]) || (m==size-1 and nums[m]!=nums[m-1]) || (nums[m]!=nums[m+1] and nums[m]!=nums[m-1]))
            return nums[m];
        

        if(m!=0 and nums[m]==nums[m-1] and m%2==1)
            return solve(nums,m+1,r,size);
        else if(m!=size-1 and nums[m]==nums[m+1] and m%2==0)
            return solve(nums,m+2,r,size);
        else
            return solve(nums,l,m-1,size);

    }
    int singleNonDuplicate(vector<int>& nums) {
        return solve(nums,0,nums.size(),nums.size());
    }
};