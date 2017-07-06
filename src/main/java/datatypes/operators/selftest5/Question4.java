package main.java.datatypes.operators.selftest5;

/**
 * Created by daniel on 06.07.17.
 */
    class Question4 {
        public static void main(String args[]) {
            String str[] = {"this", "is", "a", "bubble", "sort!"};

            int a, b;
            int size;
            String t;


            // display original array
            System.out.print("Original array is:");
            for(int i=0; i < str.length; i++)
                System.out.print(" " + str[i]);

            System.out.println();

            // This is the bubble sort.
            for(a=1; a < str.length; a++) {
                for (b = str.length - 1; b >= a; b--) {
                    if (str[b - 1].compareTo(str[b]) > 0) { // if out of order
                        t = str[b - 1];
                        str[b - 1] = str[b];
                        str[b] = t;
                    }
                }
            }



//         display sorted array
            System.out.print("Sorted array is:");
            for(int x=0; x < str.length; x++)
                System.out.print(" " + str[x]);
            System.out.println();
        }
    }

