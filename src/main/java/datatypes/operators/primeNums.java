package main.java.datatypes.operators;

/**
 * Created by daniel on 03.07.17.
 */
public class primeNums {
    public static void main(String[] args) {

        System.out.println("2");
        for (int i = 3; i <= 100; i++) {
            boolean prime = true;
            for (int count = 2; count < i; count++) {
                if (i % count == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(i);
            }

        }

    }
}
