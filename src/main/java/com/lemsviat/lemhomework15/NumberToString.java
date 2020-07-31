package main.java.com.lemsviat.lemhomework15;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberToString {
    public static void main(String[] args) {
        int n = 15;
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        FizzBuzz f = new FizzBuzz();
        System.out.println("исходный массив");
        for (int item:list
             ){
            System.out.print(item+" ");
        }
        System.out.println();
        int i=14;
        int k=list.get(i);
        Thread myThreadA = new Thread(() -> f.fizz(k));
        Thread myThreadB = new Thread(() -> f.buzz(k));
        Thread myThreadC = new Thread(() -> f.fizzbuzz(k));
        Thread myThreadD = new Thread(() -> f.number(k));
        //do {
            myThreadA.start();
            myThreadB.start();
            myThreadC.start();
            myThreadD.start();
            i++;

       // } while (i<n);

    }
}
