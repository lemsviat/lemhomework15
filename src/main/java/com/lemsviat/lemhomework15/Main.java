package main.java.com.lemsviat.lemhomework15;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread myThreadA = new Thread(foo::first);
        Thread myThreadB = new Thread(foo::second);
        Thread myThreadC = new Thread(foo::third);
        myThreadB.start();
        myThreadC.start();
        myThreadA.start();

    }
}
