class Solution {
public:
    
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int len=nums.size();
        vector<int> ans(len-k+1,0);
        deque<pair<int,int>> dq;

        int index=0;
        
        int start=0;
        int end=k-1;
        int fs=k;

        for(int i=0;i<len;i++){
            
            if(fs==0){
                start++;
                end++;
                while(!dq.empty() and dq.front().second<start){
                    dq.pop_front();
                }
                
                fs++;
                index++;
                while(!dq.empty() and dq.back().first<nums[i]){
                        dq.pop_back();
                }
                dq.push_back({nums[i],i});
            }else{
                if(dq.empty())
                    dq.push_back({nums[i],i});
                else{
                     while(!dq.empty() and dq.back().first<nums[i]){
                        dq.pop_back();
                    }
                    dq.push_back({nums[i],i});
                }
            }
            
            ans[index]=dq.front().first;
            fs--;
            
        }
        
        return ans;
    }
};