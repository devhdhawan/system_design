class Solution {
public:
    vector<int> leftGreater(vector<int>& heights,vector<int>& leftIndex){
        stack<pair<int,int>> st;

        int len=heights.size();
        for(int i=0;i<len;i++){

            if(st.empty() or st.top().first<heights[i]){
                st.push({heights[i],i});
            }else{
                int index=-1;
                while(!st.empty() and st.top().first>=heights[i]){
                    index=st.top().second;
                    st.pop();
                }
                
                if(leftIndex[index]==-1)
                    leftIndex[i]=index;
                else{
                    leftIndex[i]=leftIndex[index];
                }
                
                st.push({heights[i],i});
            }
        }
        return leftIndex;
    }

    vector<int> rightGreater(vector<int>& heights,vector<int>& rightIndex){
        stack<pair<int,int>> st;

        int len=heights.size();
        for(int i=len-1;i>=0;i--){

            if(st.empty() or st.top().first<heights[i]){
                st.push({heights[i],i});
            }else{
                int index=-1;
                while(!st.empty() and st.top().first>=heights[i]){
                    index=st.top().second;
                    st.pop();
                }
                
                if(rightIndex[index]==-1)
                    rightIndex[i]=index;
                else{
                    rightIndex[i]=rightIndex[index];
                }
                
                st.push({heights[i],i});
            }
        }
        return rightIndex;
    }
    int calculateArea(vector<int>& heights,vector<int>& leftIndex,vector<int>& rightIndex){
        int len=heights.size();
        int max_area=0;
        int breadth=1;

        for(int i=0;i<len;i++){
            int area=0;
            if(leftIndex[i]==-1 and rightIndex[i]==-1){
                area=heights[i]*breadth;
            }else if(leftIndex[i]==-1){
                area=heights[i]*(breadth+rightIndex[i]-i);
            }else if(rightIndex[i]==-1){
                area=heights[i]*(breadth-leftIndex[i]+i);
            }else{
                area=heights[i]*(breadth-leftIndex[i]+rightIndex[i]);
            }
            max_area=max(area,max_area);
        }

        return max_area;
    }
    int largestRectangleArea(vector<int>& heights) {
        int n=heights.size();
        vector<int> leftIndex(n,-1);
        vector<int> rightIndex(n,-1);

        leftIndex=leftGreater(heights,leftIndex);
        rightIndex=rightGreater(heights,rightIndex);

        
        return calculateArea(heights,leftIndex,rightIndex);
    }
};