class Solution {
public:

    int trap(vector<int>& height) {
        stack<int> st;
        int max_val=0;
        int ans=0;
        int drop=0;

        for(int i=0;i<height.size();i++){
            int val=height[i];
            if(st.empty()){
                st.push(val);
            }
            else{
                if(st.top()>=val)
                    st.push(val);
                else{
                   
                    while(!st.empty() and st.top()<val){
                        if(val<=max_val){
                            ans=ans+val-st.top();
                            drop++;
                        }else if(val>max_val){
                            ans=ans+max_val-st.top();
                        }
                        st.pop();
                    }
                    
                    st.push(val);
                    while(drop!=0){
                        st.push(val);
                        drop--;
                    }
                    
                }
            }
            max_val=max(max_val,val);
        }
        return ans;
    }
};