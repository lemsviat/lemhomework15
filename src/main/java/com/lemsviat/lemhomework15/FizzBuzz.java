package main.java.com.lemsviat.lemhomework15;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class FizzBuzz implements Runnable {
    private Semaphore sem1, sem2, sem3, sem4;

    public FizzBuzz() {
        this.sem1 = new Semaphore(1, true);
        this.sem2 = new Semaphore(0, true);
        this.sem3 = new Semaphore(0, true);
        this.sem4 = new Semaphore(0, true);
    }

    public String fizz(int m) {
        String s = "";
        try {
            sem1.acquire();
            if (m % 3 == 0 && !(m % 5 == 0)) s = "fizz, ";
            //System.out.println("s = " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sem2.release();
        return s;

    }

    public String buzz(int m) {
        String s = "";
        try {
            sem2.acquire();
            if (m % 5 == 0 && !(m % 3 == 0)) s = "buzz, ";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sem3.release();
        return s;
    }

    public String fizzbuzz(int m) {
        String s = "";
        try {
            sem3.acquire();
            if (m % 3 == 0 && m % 5 == 0) s = "fizzbuzz, ";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sem4.release();
        return s;
    }

    public String number(int m) {
        String s="";
        try {
            sem4.acquire();
            if (!(m % 5 == 0) && !(m % 3 == 0)) s = m + ", ";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sem1.release();
        return s;
    }

    @Override
    public void run() {
        int n = 1;
        fizz(n);
        buzz(n);
        fizzbuzz(n);
        number(n);
    }
}
