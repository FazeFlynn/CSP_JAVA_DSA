import java.util.*;

public class CountHash {
    public static void main(String[] args) {
        String[] arr = {"a", "a", "a", "b", "b", "c", "d", "d"};
        
        Map<String, Integer> countMap = new HashMap<>();
        
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        
        System.out.println("HashMap contents: " + countMap);
        
        String[] result = new String[countMap.size()];
        int index = 0;

        System.out.println("Hash Entry : " + countMap.entrySet());
        
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() != 1){
                result[index++] = entry.getKey() + entry.getValue();                
            } else {
                result[index++] = entry.getKey();
            }
        }
        
        System.out.println(Arrays.toString(result));
    }
}
