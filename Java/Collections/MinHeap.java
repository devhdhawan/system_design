package Collections;

import java.util.PriorityQueue;
import Collections.pair;

class pair implements Comparable<pair>{
    int first;
    int second;

    pair(int first,int second){
        this.first=first;
        this.second=second;
    }

    public int compareTo(pair other){

        if(this.first>other.first){
            return Integer.compare(other.first,other.second);
        }
        return Integer.compare(this.first,this.second);
    }   
}

class MinHeap{
    public static void main(String[] args){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pair p = new pair(0,1);
        
        System.out.print(p);
    }
}