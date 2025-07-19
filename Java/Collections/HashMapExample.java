package Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){
        // Create a HashMap
        Map<String, String> capitalMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        capitalMap.put("India", "New Delhi");
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Germany", "Berlin");

        // Print the HashMap
        System.out.println("HashMap: " + capitalMap);

        // Access elements using key
        String capitalOfIndia = capitalMap.get("India"); 
        System.out.println("Capital of India: " + capitalOfIndia);
        
        // Access elements using a loop
        for(Map.Entry<String,String> entry : capitalMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
