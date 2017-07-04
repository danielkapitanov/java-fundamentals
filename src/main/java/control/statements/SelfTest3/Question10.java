package main.java.control.statements.SelfTest3;

/**
 * Created by daniel on 04.07.17.
 */
public class Question10 {
    public static void main (String[] args) throws java.io.IOException {
        char choice;
        System.out.println("Enter a symbol and press Enter: ");

        do {
            choice = (char) System.in.read();
            if (choice>='a' && choice <='z'){
            choice-=32;
                System.out.print(choice);
            }
        else if (choice>='A' && choice<='Z'){
            choice+=32;
                System.out.print(choice);
            }

        else {
                System.out.print(choice);
            }

        } while (choice!='.');
    }
}
