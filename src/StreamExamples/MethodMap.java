package StreamExamples;

import java.util.*;
import java.util.stream.Collectors;

public class MethodMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello Java!");
        list.add("Bye");
        list.add("OK");
        list.add("Kak dela?");
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {7, 9, 6, 11, 17};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).map(i ->{if(i%3 == 0) {i = i/3;} return i;}).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello Java!");
        set.add("Bye!");
        set.add("OK");
        set.add("Kak dela?");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
