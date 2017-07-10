package main.java.objects.methods.ext.selftest6;

import java.util.Scanner;

/**
 * Created by daniel on 09.07.17.
 */
public class Stack {

        // these members are now private
        private char s[]; // this array holds the queue
        private int putloc, getloc; // the put and get indices

        Stack( int size){
            s = new char[size]; // allocate memory for queue
            putloc = getloc = 0;

        }
        // Put a characer into the queue.

    void push(char ch) {
        if (putloc == s.length) {
            System.out.println(" -- Queue is full.");
            return;
        }
        getloc=putloc;
        s[putloc++] = ch;

    }

    // Get a character from the queue.
    char pop() {
        if (putloc==0) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        return s[getloc--];
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the desired size of the array ");
        int size = input.nextInt();

        Stack test = new Stack(size);
    }


}
