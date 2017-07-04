package main.java.control.statements.SelfTest3;

/**
 * Created by daniel on 04.07.17.
 */
public class Question1 {
    public static void main (String[] args) throws java.io.IOException {
        char choice, ignore;
        int count=0;
        do {
            System.out.println("Enter a symbol and press Enter: ");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (choice==' '){
                count++;
            }
        } while (choice!='.');
        System.out.println("The number of spaces pressed is: "+count);
    }
}
