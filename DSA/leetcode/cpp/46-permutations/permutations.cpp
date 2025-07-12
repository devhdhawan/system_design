class Solution {
public:
    vector<vector<int>> ans;

    void findPermutation(vector<int>& nums,int index,int size){
        if(index==size){
            ans.push_back(nums);
            return ;
        }

        for(int i=index;i<size;i++){
            if(i!=index){
                swap(nums[i],nums[index]);
                findPermutation(nums,index+1,size);
                swap(nums[i],nums[index]);
            }else{
                findPermutation(nums,i+1,size);
            }
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        findPermutation(nums,0,nums.size());

        return ans;
    }
};