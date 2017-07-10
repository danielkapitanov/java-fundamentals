package main.java.objects.methods.ext.selftest6;

import com.sun.xml.internal.ws.util.StringUtils;

import static main.java.objects.methods.ext.selftest6.RecursiveString.reverseString;

/**
 * Created by daniel on 09.07.17.
 */
public class Recursion {
    public static void main (String[] args){

        String input ="Your mom";

        String reversed = reverseString(input);

        System.out.println(reversed);
    }
}


class RecursiveString {

    static String reversedString="";

    static String reverseString (String inputString) {

        String temp;
        int x = inputString.length();




//        if (....)
//            return reversedString;

    }
//
//        for (int i=inputString.length()-1; i>=0; i--) {
//            reversedString += inputString.charAt(i);
//        }
//
//        return reversedString;
//    }
}
