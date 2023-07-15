package Collections.map_interface;

import java.util.TreeMap;
import java.util.Comparator;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zhanarys" ," Moldabek", 3 );
        Student st2 = new Student("Aidar" ," Naimash", 3 );
        Student st3 = new Student("Nurbolat" ," Barat", 3 );
        Student st4 = new Student("Sultan" ," Razymkhan", 4 );
        treeMap.put(7.5, st1);
        treeMap.put(7.2, st2);
        treeMap.put(3.7, st3);
        treeMap.put(6.5, st4);
        System.out.println(treeMap); // по возрастанию
        System.out.println(treeMap.lastEntry()); // самый большой
        System.out.println(treeMap.firstEntry()); // самый маленький
        System.out.println(treeMap.descendingMap()); // в обратном порядке
        System.out.println(treeMap.headMap(7.7)); // значения ниже указанного
        System.out.println(treeMap.tailMap(5.5)); // значения выше указанного

        TreeMap<Student, Double> treeMap1 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
            });
        treeMap1.put(st1, 7.1);
        treeMap1.put(st2, 4.2);
        treeMap1.put(st3, 7.8);
        treeMap1.put(st4, 7.0);
        System.out.println(treeMap1);
        Student st5 = new Student("Sultan" ," Razymkhan", 4 );
        System.out.println(treeMap1.containsKey(st5)); // в TreeMap все проверяется через compareTо и
        // поэтому даже без equals() hashCode метода вернет true
    }
}
