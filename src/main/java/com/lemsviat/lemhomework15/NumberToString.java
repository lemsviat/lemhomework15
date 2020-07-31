package main.java.com.lemsviat.lemhomework15;
import java.util.ArrayList;

public class NumberToString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuffer sb1 = new StringBuffer();
        int n = 15;
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        FizzBuzz f = new FizzBuzz();

        System.out.println("Исходный массив:");
        for (int item : list
        ) {
            sb.append(item).append(", ");
        }
        sb.replace(sb.length() - 2, sb.length() - 1, ".");
        System.out.print(sb + "\n");

        System.out.print("Преобразованный массив:\n");
        Thread myThreadA = new Thread(() -> {
            for (int item : list
            ) {
                sb1.append(f.fizz(item));
            }
        });
        Thread myThreadB = new Thread(() -> {
            for (int item : list
            ) {
                sb1.append(f.buzz(item));
            }
        });
        Thread myThreadC = new Thread(() -> {
            for (int item : list
            ) {
                sb1.append(f.fizzbuzz(item));
            }
        });
        Thread myThreadD = new Thread(() -> {
            for (int item : list
            ) {
                sb1.append(f.number(item));
            }
            sb1.replace(sb1.length() - 2,sb1.length()-1,".");
            System.out.print(sb1);
        });
        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
        myThreadD.start();
    }
}
