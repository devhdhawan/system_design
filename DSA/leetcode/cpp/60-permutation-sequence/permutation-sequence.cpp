class Solution {
public:
    string ans;
    int count=0;
    void findPermutationSequence(string s,int index,int size,int k){
            if(index==size){
                count++;
                if(count==k){
                    ans=s;
                }
               
                return ;
            }
            
            sort(s.begin()+index,s.end());

            for(int i=index;i<size;i++){
                    // cout<<i<<"-->"<<index<<" ";
                    if(i==index)
                        findPermutationSequence(s,i+1,size,k);
                    else{
                        swap(s[i],s[index]);
                        findPermutationSequence(s,index+1,size,k);
                        swap(s[i],s[index]);
                    }

            }
    }
    string getPermutation(int n, int k) {
        string s;
        for(int i=1;i<=n;i++){
            s=s+to_string(i);
        }
        
        findPermutationSequence(s,0,n,k);
        
        return ans;
    }
};