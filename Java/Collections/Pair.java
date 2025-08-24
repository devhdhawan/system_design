package Collections; 
public class Pair implements Comparable<Pair>{
    int first;
    int second;

    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair other){

        if(this.first>other.first){
            Integer.compare(other.first,other.second);
        }
        return Integer.compare(this.first,this.second);
    }
}