class Solution {
public:
    vector<vector<string>> ans;
    bool checkPallindrome(string s){
        int i=0,j=s.size()-1;

        while(i<=j){
            if(s[i]==s[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    void findPallindrome(string s,int index,int size,vector<string> plist){
            if(index==size){
                ans.push_back(plist);
                return ;
            }

            string tmp;
            
            for(int i=index;i<s.size();i++){
                tmp=tmp+s[i];
                if(checkPallindrome(tmp)){
                    plist.push_back(tmp);
                    findPallindrome(s,i+1,size,plist);
                    plist.pop_back();
                }
                
            }
    }
    vector<vector<string>> partition(string s) {
        vector<string> plist;

        findPallindrome(s,0,s.size(),plist);

        return ans;
    }
};