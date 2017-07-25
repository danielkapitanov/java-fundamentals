package main.java.io;

/**
 * Created by daniel on 14.07.17.
 */
import java.io.*;

class Challenge {
    public static void main(String args[]) throws IOException
    {
        int i;


        // First, confirm that both files has been specified.
        if(args.length != 3) {
            System.out.println("You need to enter 3 arguments, moron!");
            return;
        }

        // Open and manage two files via the try statement.
        try (FileOutputStream fout = new FileOutputStream(args[0]+"dani.txt"))
        {

            String test="Hello I/O";
            int x=0;
            do {
                fout.write(test.charAt(x));
                x++;
            } while (x<test.length());
            System.out.println("Written to file dani.txt");

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

        try (FileOutputStream fout2 = new FileOutputStream(args[0]+args[1]);
        FileInputStream fin = new FileInputStream(args[0] + "dani.txt")) {


            do {
                i = fin.read();
                if (i != -1) fout2.write(i);
            } while (i != -1);

            System.out.println("File copied to " + args[1]);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

        try (FileOutputStream fout3 = new FileOutputStream(args[2]+args[1]);
             FileInputStream fin2 = new FileInputStream(args[0] + args[1])){


            do {
                i = fin2.read();
                if (i != -1) fout3.write(i);
            } while (i != -1);

            System.out.println("File copied to " + args[2] + args[1]);



        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
