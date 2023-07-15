package Collections;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> phones = new ArrayList<>(10);
        phones.add("Iphone");
        phones.add("Samsung");
        phones.add("Oppo");
        phones.add(1, "Xiaomi");
        System.out.println(phones);
        System.out.println(phones.get(2));
        /*System.out.println();
        for (String s:phones) {
            System.out.println(s + " ");
        }
        System.out.println();
        for (int i = 0; i < phones.size(); i++) {
            System.out.println(phones.get(i));
        } */
        phones.set(2, "Redmi");
        System.out.println(phones);
        System.out.println(phones.get(2));

        phones.remove(2);
        System.out.println();
        System.out.println(phones);

        ArrayList<String> phones2 = new ArrayList<>();
        phones2.add("A21");
        phones2.add("IPad");
        phones2.add("Iphone");
        phones2.add("Oppo");
        phones.removeAll(phones2);
        System.out.println("removeAll method: " + phones);//-->> екінші салынатын листтагыдай элементтер кездесетін болса өшіреді.
        //retainAll осыған наоборот. бірдей элементтерді қана қалдырып қалғанын өшіріп тастайды.
        phones.addAll(phones2);
        System.out.println(phones);
        phones.remove(3);
        System.out.println(phones);
        phones.addAll(1, phones2);
        System.out.println(phones);
        System.out.println(phones.indexOf("IPad"));
        System.out.println(phones.lastIndexOf("IPad"));
        System.out.println(phones.contains("Samsung"));
        System.out.println(phones.contains("Iphone"));
        phones.clear();
        System.out.println(phones);
    }
}
