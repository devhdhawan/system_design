package DSA.TrieTmp;

public class WordCount {
    static TrieNode rootNode;
    public static int wordOccurrence(String word){
        TrieNode node=rootNode;

        int n=word.length();
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);

            if(!node.isContainsKey(ch)){
                return 0;
            }else{
                node=node.getChar(ch);
            }
        }
        return node.wordCount;
    }

    public static void main(String[] args){
        Trie root = new Trie();
        rootNode=root.root;
       

        String[] input_arr={ "iphone","samsung","samsung","nokia" };
        for(var input:input_arr){
            root.insert(input);
        }
        
        String[] search_arr={"samsung","nokia","reliance"};

        for(var word:search_arr){
            System.out.printf(
            "Prefix count of %s:%d \n",word,wordOccurrence(word)
        );

        }
    }
}
