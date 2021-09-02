package fun;

import java.util.stream.IntStream;

public class Sync {
    private final static Object lock  = new Object();

    public static void main(String[] args) {


        Thread odd = new Thread(() -> {
            synchronized (lock) {
                IntStream.rangeClosed(0, 49).forEach(i -> {
                    System.out.println(2 * i + 1);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                lock.notify();
            }
        });

        Thread even = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock) {
                IntStream.rangeClosed(1, 50).forEach(i -> {
                    System.out.println(2 * i);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
        });

        even.start();
        odd.start();

    }
}
