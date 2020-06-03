package com.string;

public class StringObjectsDemo {
    public static void main(String[] args) {

        // --> Single line comment


        /*
           multiline comment
         */


        /**
         *
         */

        String s1 = new String("You can't change me");
        String s2 = new String("You can't change me");
        System.out.println(s1 == s2); //false


        String s3 = "You can't change me";
        System.out.println(s1 == s3); // false

        String s4 = "You can't change me";
        System.out.println(s3 == s4); // true

        String s5 = "You can't" + " change me"; // You can't change me
        System.out.println(s4 == s5); // true

        String s6 = "You can't";
        String s7 = s6 + " change me"; // You can't change me -- s7 (Run time)
        System.out.println(s4 == s7); // false

        final String s8 = "You can't";
        String s9 = s8 + " change me"; // You can't change me -- s9(compile time)
        System.out.println(s4 == s9); // true

    }

}
