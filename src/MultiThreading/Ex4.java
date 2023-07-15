package MultiThreading;

public class Ex4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": " + i); // name of the current method
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MySleep());
        Ex4 thread2 = new Ex4();
        thread1.start();
        thread2.start();
        thread1.join(); //after the calling join() method the main thread - main will work after them, will work last
        thread2.join();

        System.out.println("Hello"); //поток мэйн будет работать не ожидая работы других потоков - 1сек
    }
}

class MySleep implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
