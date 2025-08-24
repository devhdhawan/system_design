package DSA.Trie;

class TrieNode {
    TrieNode[] links = new TrieNode[26];
    boolean isEnd = false;
    public int endWith=0;
    public int countPrefix=0;

    public TrieNode() {
 
    }

    public boolean isContainsKey(char ch){
        return (links[ch - 'a']!=null);
    }

    public void put(char ch){
        links[ch - 'a'] = new TrieNode();
    }
    public TrieNode get(char ch){
        return links[ch-'a'];
    }

    public void setEnd(){
        isEnd=true;
    }

    public void increseCountPrefix() {
        countPrefix++; // Increment the count of prefixes that pass through this node
    }

    public void decreseCountPrefix() {
        countPrefix--; // Decrement the count of prefixes that pass through this node
    }

    public void increaseEndWith() {
        endWith++; // Increment the count of words ending with this node
    }

    public void decreaseEndWith() {
        endWith--; // Decrement the count of words ending with this node
    }

    public int getEndWith() {
        return endWith; // Return the count of words ending with this node
    }

    public int getCountPrefix() {
        return countPrefix; // Return the count of prefixes that pass through this node
    }
    
}