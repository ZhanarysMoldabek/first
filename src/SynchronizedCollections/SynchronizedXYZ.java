package SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedXYZ {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> source = new ArrayList<>();
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());

        for(int i = 0; i < 5; i++) {
            source.add(i);
        }

        System.out.println(source);
        System.out.println(synchList);

        Runnable runnable = () -> synchList.addAll(source);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
