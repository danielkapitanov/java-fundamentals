package main.java.datatypes.operators.selftest5;

/**
 * Created by daniel on 06.07.17.
 */
public class Question3 {
    public static void main(String[] args){

        double average[] = {13.0, 76.2, 44.4, 51.3, 18.0, 0.0, -11.5, 88.8, -29.6, -11.1};
        double sum = 0;

        for (int i=0; i<average.length; i++) {
            sum+=average[i];
        }
        System.out.println("The average is "+sum/10);
    }
}
