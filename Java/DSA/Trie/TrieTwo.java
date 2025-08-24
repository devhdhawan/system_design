package DSA.Trie;

public class TrieTwo {
    private static TrieNode root;
    TrieTwo(){
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.isContainsKey(ch)==false){
                //Key is not present, now create the new key
                node.put(ch);
            }
            node=node.get(ch);
            node.increseCountPrefix(); // Increment the count of prefixes that pass through this node
        }
        //At the set the flag to true;
        node.increaseEndWith(); // Increment the count of words ending with this node
        node.setEnd();
    }

    public boolean search(String word){
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.isContainsKey(ch)==false)
                return false;
            node=node.get(ch);
        }
        if(node.getEndWith()>0)
            return true;
        return false;
    }

    public boolean searchPrefix(String prefix){
        // Search for words with a given prefix
        TrieNode node=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(node.isContainsKey(ch)==false)
                return false;
            node=node.get(ch);
        }
        
        return true; // If we reach here, it means the prefix exists
    }
    public void erase(String word){
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.isContainsKey(ch)==false)
                return;
            node=node.get(ch);
            node.decreseCountPrefix(); // Decrement the count of prefixes that pass through this node
        }
        
        node.decreaseEndWith(); // Decrement the count of words ending with this node
    }
    public int countWordEqualTo(String word){
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.isContainsKey(ch)==false)
                return 0;
            node=node.get(ch);
        }
        
        return node.getEndWith(); // Return the count of words equal to the given word
    }

    public int countPrefixEqualTo(String prefix){
        TrieNode node=root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(node.isContainsKey(ch)==false)
                return 0;
            node=node.get(ch);
        }
        
        return node.getCountPrefix(); // Return the count of prefixes equal to the given prefix
    }
    public boolean LongestWordWithAllPrefixes(String word){
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            
            if(node.getEndWith()<=0)
                return false;
            node=node.get(ch);

        }
        return true;
    }
    public static void main(String[] args){
        // Example usage of the Trie
        TrieTwo obj = new TrieTwo();
        String[] arrStrings = {"n","ni","nin","ninj","ninja","ninga"};

        for(var st:arrStrings){
            obj.insert(st);
        }

        //Check Longest Prefixes
        int longest_word_len=0;
        String longest_word_str="";
        for(var st:arrStrings){
            int len=st.length();
            System.out.println(st+" "+obj.search(st));
            if(obj.LongestWordWithAllPrefixes(st)){
                System.out.println(longest_word_len+" "+len);
                if(len>longest_word_len){
                    longest_word_len=len;
                    longest_word_str=st;
                }
                
            }
        }

        System.out.println("Longest Word With All Prefix:"+longest_word_str);

        // obj.insert("apple");
        // obj.insert("apps");
        // System.out.println("Prefix 'app' Count: " + obj.countPrefixEqualTo("app")); // Should return 2
        // obj.erase("apps");
        // System.out.println("Prefix 'app' Count after erasing 'apps': " + obj.countPrefixEqualTo("app")); // Should return 1
        // System.out.println("Search Word 'apple': " + obj.search("apple")); // Should return true
        // System.out.println("Search Word 'apples': " + obj.search("apples")); // Should return false
        // obj.insert("apple");
        // System.out.println("Count of words equal to 'apple': " + obj.countWordEqualTo("apple")); // Should return 2
        // obj.erase("apple");
        // System.out.println("Count of words equal to 'apple' after erasing one: " + obj.countWordEqualTo("apple")); // Should return 1
        // obj.erase("apple");
        // System.out.println("Count of words equal to 'apple' after erasing all: " + obj.countWordEqualTo("apple")); // Should return 0
        // System.out.println("Search Word apple after erasing all: " + obj.search("apple")); // Should return false
        
    }
}
