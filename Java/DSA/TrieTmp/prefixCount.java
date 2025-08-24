package DSA.TrieTmp;

public class prefixCount {
    static TrieNode rootNode;


    public static int getPrefixCount(String prefix){
        TrieNode node=rootNode;

        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            if(!node.isContainsKey(ch)){
                return 0;
            }else{
                node = node.getChar(ch);
            }
        }


        return node.prefixCount;
    }

    public static void main(String[] args){
        Trie root = new Trie();
        rootNode=root.root;
       

        String[] input_arr={ "gee", "geek", "geezer", "geeksforgeeks", "geekiness", "geekgod" };
        for(var input:input_arr){
            root.insert(input);
        }
        
        String[] search_arr={"gee","geek","for","geeki","ness","geezer","ap"};

        for(var word:search_arr){
            System.out.printf(
            "Prefix count of %s:%d \n",word,getPrefixCount(word)
        );

        }
        

    }
}
