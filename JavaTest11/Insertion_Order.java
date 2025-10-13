import java.util.*;

public class Insertion_Order {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
    
}
}
}
