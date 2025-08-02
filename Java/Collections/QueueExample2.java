package Collections;

import java.util.*;

class Pair{
    Integer key;
    Integer value;

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }
}

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(1,10));

        Pair p1 =q.poll();

        System.out.println(p1.getKey() + " " + p1.getValue());

    }
}
