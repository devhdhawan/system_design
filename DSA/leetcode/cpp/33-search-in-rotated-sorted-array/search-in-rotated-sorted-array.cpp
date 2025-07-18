class Solution {
public:
    int solve(vector<int>& nums,int l,int r,int firstValue,int size){
        if(l>r)
            return 0;
        int mid=(l+r)/2;

        if(mid!=0 and mid!=size-1 and nums[mid]<nums[mid-1] and nums[mid]>nums[mid+1])
            return mid;
        else if(mid!=0 and nums[mid]<nums[mid-1])
            return mid;

        if(nums[mid]>=firstValue){
            return solve(nums,mid+1,r,firstValue,size);
        }else{
            return solve(nums,l,mid-1,firstValue,size);
        }

    }

    int bs(vector<int>&nums,int l,int r,int target){
        if(l>r)
            return -1;
        int mid=(l+r)/2;

        if(nums[mid]<target)
            return bs(nums,mid+1,r,target);
        else if(nums[mid]>target)
            return bs(nums,l,mid-1,target);
        else
            return mid;
    }
    
    int search(vector<int>& nums, int target) {
        int size=nums.size();  
        int l=0;
        int index=solve(nums,0,size-1,nums[0],size);

        if(nums[index]<=target and nums[size-1]>=target)
            return bs(nums,index,size-1,target);
        else 
            return bs(nums,l,index-1,target);
        

        return index;
    }
};