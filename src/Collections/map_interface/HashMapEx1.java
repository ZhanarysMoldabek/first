package Collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1001, "Zhanarys Moldabek");
        map1.put(1002, "Doszhan Moldabek");
        map1.put(1003, "Korkem Moldabek");
        map1.put(1004, "Zhandos Moldabek");

        System.out.println(map1);

        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.containsKey(1002));
        System.out.println(map1.containsValue("Zhanarys Moldabek"));
        System.out.println(map1.get(1001));
        map1.putIfAbsent(1005, "Madina Moldabek");
        map1.put(null, "Bakhytzhan Makhashev");
        map1.put(1007, null);
        System.out.println(map1);
    }
}
