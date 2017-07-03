package main.java.fundamentals;

class Example1 {
    // A Java program begins with a call to main().
    public static void main (String[] args){

        double inches, meters;
        int counter;

        counter = 0;
        for(inches = 1; inches <= 120; inches++) {
            meters = inches/39.37; // convert to meters
            System.out.println(inches + " inches is " +
                    meters + " meters");
            counter++;
            // every 10th line, print a blank line
            if(counter == 12) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}
