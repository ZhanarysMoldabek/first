package StreamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get(); // 5 * 2 *3 *4 *2
        System.out.println(result);

        List<Integer> list1 = new ArrayList<>();
        Optional<Integer> optional = list1.stream().reduce((accumulator, element) -> accumulator * element);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        else {
            System.out.println("Optional is not Present");
        }
        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Java Developer");
        list2.add("Hi");
        list2.add("Bye");
        list2.add("Ok");

        String result1 = list2.stream().reduce((accumulator, element) -> accumulator + " " +  element).get();
        System.out.println(result1);
    }
}
