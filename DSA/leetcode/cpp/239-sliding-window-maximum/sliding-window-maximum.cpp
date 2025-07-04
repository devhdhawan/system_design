class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int len=nums.size();
        vector<int> ans;
        deque<int> dq;

        for(int i=0;i<len;i++){
            while(!dq.empty() and dq.front()==i-k)
                dq.pop_front();
            
            while(!dq.empty() and nums[dq.back()]<nums[i])
                dq.pop_back();
            
             dq.push_back(i);

             if(i>=k-1)
                ans.push_back(nums[dq.front()]);
        }

        return ans;
    }
};