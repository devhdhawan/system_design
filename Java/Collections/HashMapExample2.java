package Collections;
// import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Comparator;

public class HashMapExample2 {
    public static void main(String[] args){
        // Create a HashMap
        Map<Integer, ArrayList<Integer>> mp= new HashMap<>();
        

        // Add key-value pairs to the HashMa
        ArrayList<Integer> lis=new ArrayList<>();
        lis.add(11);
        lis.add(21);

       mp.computeIfAbsent(1, k -> new ArrayList<>()).add(11);
       mp.computeIfAbsent(3,k->new ArrayList<>()).add(21);
       mp.computeIfAbsent(3,k->new ArrayList<>()).add(54);
       mp.computeIfAbsent(4,k->new ArrayList<>()).add(42);
       mp.computeIfAbsent(2,k->new ArrayList<>()).add(93);
       System.out.println(mp);
       
    
       Map<Integer,ArrayList<Integer>> sortMap=new TreeMap<>(Comparator.reverseOrder());
       sortMap.putAll(mp);
        System.out.println(sortMap);

        for(Map.Entry<Integer,ArrayList<Integer>> entry : sortMap.entrySet()){
            ArrayList<Integer> tmp=entry.getValue();
            System.out.println(tmp.get(tmp.size()-1));
        }

        
        Map<Integer,Integer> mp2=new HashMap<>();
        mp2.computeIfAbsent(1,k->10);
        mp2.computeIfAbsent(1,k->20);
        mp2.computeIfAbsent(3,k->30);

        System.out.println(mp2);
        
       
    }
}
