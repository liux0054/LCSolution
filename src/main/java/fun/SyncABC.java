package fun;

import java.util.concurrent.locks.ReentrantLock;

public class SyncABC {
    //2、有三个线程ID分别是A、B、C,请用多线编程实现，在屏幕上循环打印10次ABCABC,请补充以下代码:

    public static void main(String[] args) {
        MajusculeABC maj = new MajusculeABC();
        Thread t_a = new Thread(new Thread_ABC(maj , 'A'));
        Thread t_b = new Thread(new Thread_ABC(maj , 'B'));
        Thread t_c = new Thread(new Thread_ABC(maj , 'C'));
        t_c.start();
        t_b.start();
        t_a.start();
    }
}

class MajusculeABC {
    //请补充代码
    ReentrantLock lock;

    public MajusculeABC() {
        lock = new ReentrantLock(true);
    }

    public synchronized ReentrantLock getLock() {
        return lock;
    }
}

class Thread_ABC implements Runnable {
    //请补充代码
    private final char ch;
    private final MajusculeABC majusculeABC;

    public Thread_ABC(MajusculeABC majusculeABC, char ch) {
        this.majusculeABC = majusculeABC;
        this.ch = ch;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            try {
                majusculeABC.getLock().lock();
                System.out.print(ch);
            } finally {
                majusculeABC.getLock().unlock();
            }
        }
    }
}
