class Solution {
public:
    bool isValid(string s) {
        // Initialize stack
        stack <char> st;

        //length of string
        int len=s.size();

        for(int i=0;i<len;i++){
            if(st.empty())
                st.push(s[i]);
            else{
                // Pop if stack top contains (
                if(st.top()=='(' and s[i]==')')
                    st.pop();
                
                // Pop if stack top contains [
                else if(st.top()=='[' and s[i]==']')
                    st.pop();
                
                // Pop if stack top contains {}
                else if (st.top()=='{' and s[i]=='}')
                    st.pop();
                else
                    st.push(s[i]);
            }

        }

        // Check if stack is empty then parenthesis are balanced return true
        if(st.empty())
            return true;

        return false;        
    }
};