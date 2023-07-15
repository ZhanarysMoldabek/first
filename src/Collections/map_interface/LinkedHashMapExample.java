package Collections.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Zhanarys" ," Moldabek", 3 );
        Student st2 = new Student("Aidar" ," Naimash", 3 );
        Student st3 = new Student("Nurbolat" ," Barat", 3 );
        Student st4 = new Student("Sultan" ," Razymkhan", 4 );

        lhm.put(4.5, st1);
        lhm.put(4.8, st2);
        lhm.put(2.5, st3);
        lhm.put(8.7, st4);

        System.out.println(lhm);

        System.out.println(lhm.get(2.5));
        System.out.println(lhm.get(4.8)); //если порядок доступности true то джава сохраняет последние возвращенные
        // элементы последними при следущем вызове принта линкедхэшмапа

        System.out.println(lhm);
    }
}
