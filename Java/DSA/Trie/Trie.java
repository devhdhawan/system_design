// package DSA.Trie;

// class TrieNode {
//     TrieNode[] links = new TrieNode[26];
//     boolean isEnd = false;

//     public TrieNode() {
//         // for (int i = 0; i < 26; i++) {
//         //     links[i] = null;
//         // }
//     }

//     public boolean isContainsKey(char ch){
//         return (links[ch - 'a']!=null);
//     }

//     public void put(char ch){
//         links[ch - 'a'] = new TrieNode();
//     }
//     public TrieNode get(char ch){
//         return links[ch-'a'];
//     }

//     public void setEnd(){
//         isEnd=true;
//     }
// }

// public class Trie {
//     private static TrieNode root;
//     Trie(){
//         root=new TrieNode();
//     }
//     public void insert(String word){
//         TrieNode node=root;
//         for(int i=0;i<word.length();i++){
//             //You have character
//             char ch=word.charAt(i);
//             //Now check if this node is exist or not
//             if(node.isContainsKey(ch)==false){
//                 //Key is not present, now create the new key
//                 node.put(ch);
//             }
//             node=node.get(ch);
//         }
//         //At the set the flag to true;
//         node.setEnd();
//     }

//     public boolean search(String word){
//         TrieNode node=root;
//         for(int i=0;i<word.length();i++){
//             char ch=word.charAt(i);
//             if(node.isContainsKey(ch)==false)
//                 return false;
//             node=node.get(ch);
//         }
//         if(node.isEnd==true)
//             return true;
//         return false;
//     }

//     public boolean searchPrefix(String prefix){
//         // Search for words with a given prefix
//         TrieNode node=root;
//         for(int i=0;i<prefix.length();i++){
//             char ch=prefix.charAt(i);
//             if(node.isContainsKey(ch)==false)
//                 return false;
//             node=node.get(ch);
//         }
        
//         return true; // If we reach here, it means the prefix exists
//     }

//     public static void main(String[] args){
//         // Example usage of the Trie
//         Trie obj = new Trie();
        
//         obj.insert("hello");
//         obj.insert("world");
//         obj.insert("apple");
//         obj.insert("app");
//         obj.insert("helicopter");
//         obj.insert("hero");
//         System.out.println(obj.search("hello")); // true
//         System.out.println(obj.search("hell")); // false
//         System.out.println(obj.searchPrefix("he")); // true
//         System.out.println(obj.searchPrefix("hero")); // true
//         System.out.println(obj.searchPrefix("her")); // true
//         System.out.println(obj.searchPrefix("heros")); // false
//         System.out.println(obj.search("apple")); // true
//         System.out.println(obj.search("app")); // true
//         System.out.println(obj.search("appl")); // false
//     }
// }
