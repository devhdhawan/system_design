package DSA.TrieTmp;

class TrieNode {
    TrieNode[] links;
    boolean isEnd;
    int prefixCount;
    int wordCount;

    TrieNode(){
        links =  new TrieNode[26];
        isEnd=false;
        prefixCount=0;
        wordCount=0;
    }

    public boolean isContainsKey(char ch){
        return (links[ch-'a']!=null);
    }

    public TrieNode insertChar(char ch){
        links[ch-'a']=new TrieNode();
        return links[ch-'a'];
    }

    public TrieNode getChar(char ch){
        return links[ch-'a'];
    }

    public void setEnd(){
        this.isEnd=true;
    }

    public void increasePrefixCount(){
        prefixCount++;
    }

    public void decreasePrefixCount(){
        prefixCount--;
    }

    public void increaseWordCount(){
        wordCount++;
    }

    public void decreaseWordCount(){
        wordCount--;
    }
}