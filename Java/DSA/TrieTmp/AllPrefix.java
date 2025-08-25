package DSA.TrieTmp;

public class AllPrefix {
    static TrieNode root;
    public static int getMaxPrefixLength(String word){
        TrieNode node =root;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            if(!node.isContainsKey(ch)){
                return 0;
            }
            node=node.getChar(ch);
            if(node.getEnd()==false)
                return 0;
        }   

        if(node.getEnd()==true)
            return 1;
        return 0;
    }
    
    public static void main(String[] args){
        String[] wordList = {"n","ni","ninj","nin","ninja","ninga"};
        // String[] wordList={ "cat" , "car" , "cow", "c", "ca", "t", "r", "w" };

        Trie obj = new Trie();
        root=obj.root;
        for(var word:wordList){
            obj.insert(word);
        }
        int ans=0;
        for(var word:wordList){
            if(getMaxPrefixLength(word)==1){
                    ans=Math.max(word.length(),ans);
            }
        }

        System.out.println(ans);

    }
}
