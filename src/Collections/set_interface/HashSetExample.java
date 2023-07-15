package Collections.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zhanarys");
        set.add("Korkem");
        set.add("Doszhan");
        set.add("Zhandos");
        set.add("Madina");
        set.add("Madina"); //do not save duplicates
        set.add(null);
        System.out.println(set);

        for (String s: set) {
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Misha"));
        // System.out.println(set.get()); no get method

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>(); //in parameters set1
        set2.add(2);
        set2.add(10);
        set2.add(9);
        set2.add(7);
        set2.add(1);

        HashSet<Integer> operation = new HashSet<>(set1);
        // System.out.println(operation.addAll(set2)); // 1 2 3 4 5 7 9 10 union
        // System.out.println(operation.retainAll(set2)); // 1 2 intersect
        // System.out.println(operation.removeAll(set2)); // 3 4 5 subtract
    }
}
