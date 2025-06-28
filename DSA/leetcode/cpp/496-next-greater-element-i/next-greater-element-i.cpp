class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        //Initialize Map to store next greater element for nums2
        map<int,int> m;

        //Initialize stack
        stack<int> st;

        //Initialize vector
        vector<int> ans;

        int len=nums2.size();

        for(int i=0;i<len;i++){
            if(st.empty())
                st.push(nums2[i]);
            else{
                // Run while untill stack got empty and st.top()<nums2[i] condition true
                while(!st.empty() and st.top()<nums2[i]){
                    m[st.top()]=nums2[i];
                    st.pop();
                }
                st.push(nums2[i]);
            }
        }

        for(int i=0;i<nums1.size();i++){
            //Check if the element present in map if not it means no next greater in array.
            if(m.find(nums1[i])!=m.end())
                ans.push_back(m[nums1[i]]);
            else{
                ans.push_back(-1);
            }
        }

        return ans;
    }
};