package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();   //-->> first
        cars.add("BMW");
        cars.add("Mercedes");       // capacity and size are not the same things;
        cars.add("Toyota");
        cars.add("Audi");
        cars.add("Hyundai");
        System.out.println(cars);
        ArrayList<String> abc = new ArrayList<String>(5);   //ways of creating list -->> second
        List<String> abc1 = new ArrayList<String>();    //-->> third
        ArrayList<String> abc12 = new ArrayList<>();    //-->> fourth
        ArrayList<String> abc123 = new ArrayList<String>(cars);    //-->> fifth
        System.out.println(abc123);
        abc123.add("Honda");
        System.out.println(cars==abc123);
        System.out.println(abc123);
        List<String> myList = cars.subList(1, 4);
        System.out.println(myList);
        myList.add("Kia");
        System.out.println(myList);
        System.out.println(cars);

    }
}
