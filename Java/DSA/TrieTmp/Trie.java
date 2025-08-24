package DSA.TrieTmp;

public class Trie {
    TrieNode root;

    Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode node =root;

        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            
            if(!node.isContainsKey(ch)){
                node=node.insertChar(ch);
            }else{
                node = node.getChar(ch);
            }
        
            node.increasePrefixCount();
        }
        node.setEnd();
        node.increaseWordCount();
    }

    public boolean search(String word){
        TrieNode node=root;

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);

            if(!node.isContainsKey(ch)){
                return false;
            }else{
                node=node.getChar(ch);
            }
            
        }

        
        if(node.isEnd)
            return true;

        return false;
    }

    public boolean searchPrefix(String prefix){
        TrieNode node = root;
        
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(!node.isContainsKey(ch))
                return false;
            node=node.getChar(ch);
        }

        return true; // As we reach here it means prefix exists.
    }


}


