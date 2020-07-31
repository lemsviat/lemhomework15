package main.java.com.lemsviat.lemhomework15;

import java.util.ArrayList;

public class FizzBuzz implements Runnable {
    int number;

    public FizzBuzz() {
    }


    public void fizz(int m) {
        if (m % 3 == 0 && !(m % 5 == 0)) System.out.println("fizz, ");
    }

    public void buzz(int m) {
        if (m % 5 == 0 && !(m % 3 == 0)) System.out.println("buzz, ");
    }

    public void fizzbuzz(int m) {
        if (m % 3 == 0 && m % 5 == 0) System.out.println("fizzbuzz, ");
    }

    public void number(int m) {
        if (!(m % 5 == 0) && !(m % 3 == 0)) System.out.println(m + ", ");
    }

    @Override
    public void run() {
        int n = 9;
        fizz(n);
        buzz(n);
        fizzbuzz(n);
        number(n);
    }
}
