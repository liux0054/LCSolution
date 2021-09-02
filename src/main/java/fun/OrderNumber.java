package fun;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class OrderNumber {
    private static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
    public static void main(String[] args) {
        Thread oddPutThread = new Thread(() -> {
            for (int i=0; i<=49; i++) {
                try {
                    queue.put(i);
                    System.out.println(2 * i + 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread evenConsumeThread = new Thread(() -> {
           for (int i=1; i<=50; i++) {
               try {
                   queue.take();
                   System.out.println(2 * i);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });

        oddPutThread.start();
        evenConsumeThread.start();
    }
}
