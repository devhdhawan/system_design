class Solution {
public:
    string reverseWords(string s) {
        vector<string> arr; //
        string tmp="";

        for(int i=0;i<s.size();i++){
            if(s[i]==' '){
                if(tmp.size()!=0){
                    arr.push_back(tmp);
                    tmp="";
                }
            }else{
                tmp=tmp+s[i];
                if(i==s.size()-1)
                    arr.push_back(tmp);
            }
        }
        
        string ans="";
        
        reverse(arr.begin(),arr.end());
        for(int i=0;i<arr.size();i++){
            ans=ans+arr[i];
            if(i!=arr.size()-1)
                ans=ans+' ';
        }
        return ans;
    }
};