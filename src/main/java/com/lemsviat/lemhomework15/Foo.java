package main.java.com.lemsviat.lemhomework15;
import java.util.concurrent.Semaphore;

public class Foo implements Runnable {
    private Semaphore sem1, sem2, sem3;

    public Foo() {
        this.sem1 = new Semaphore(1, true);
        this.sem2 = new Semaphore(0, true);
        this.sem3 = new Semaphore(0, true);
    }
    public void first() {
        try {
            this.sem1.acquire();
            System.out.print("first");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sem2.release();
    }
    public void second() {
        try {
            sem2.acquire();
            System.out.print("second");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sem3.release();
    }
    public void third() {
        try {
            sem3.acquire();
            System.out.print("third");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        first();
        second();
        third();
    }
}

