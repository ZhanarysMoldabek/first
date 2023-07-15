import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> sinip = new ArrayList<>();
        sinip.add("A");
        sinip.add("B");
        sinip.add("C");
        sinip.add("D");
        sinip.add("E");
        sinip.add("F");
        System.out.println("ArrayList: " + sinip);
        Object[] array = sinip.toArray();
        System.out.println();
        String[] array1 = sinip.toArray(new String[0]);
        for (String s:array1) {
            System.out.println(s);
        }
        System.out.println();
        List<Integer> list = List.of(10, 20, 30, 40);
        System.out.println(list);
//        list.add(120);//-->> бұл полюбому енгізілмейді, себебі лист осылай создать етілсе модификация болмайды, еще нулл сактамайды

        List<String> list1 = List.copyOf(sinip);
        System.out.println(list1); //бұл методта да модификация болмайды, нулл да сақталмайды
    }
}
