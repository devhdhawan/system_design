package DSA.TrieTmp;

public class Main {
    public void main(String[] args){
        Trie root = new Trie();

        root.insert("samsung");
        root.insert("nokia");
        root.insert("iphone");

        
        System.out.println(
            "Samsung status:"+root.search("samsung")+"\n"+
            "Nokia status:"+root.search("nokia")+"\n"+
            "Iphone:"+root.search("iphone")+"\n"+
            "Reliance status:"+root.search("reliance")+"\n"
        );

        System.out.println(
            "Is Prefix:sam exists? "+(root.searchPrefix("sam")?"Yes Exists":"Not Exists")+"\n"+
            "Is Prefix:nok exists? "+(root.searchPrefix("nok")?"Yes Exists":"Not Exists")+"\n"+
            "Is Prefix:ips exists? "+(root.searchPrefix("ips")?"Yes Exists":"Not Exists")+"\n"+
            "Is Prefix:noki exists? "+(root.searchPrefix("noki")?"Yes Exists":"Not Exists")+"\n"
        );
    }
}
