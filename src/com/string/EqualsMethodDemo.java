package com.string;

public class EqualsMethodDemo {
    public static void main(String[] args) {
        /**
         * difference between "==" and equals()
         */
        String s1 = new String("Person");
        String s2 = new String("Person");


        String s3 = "Person";
        String s4 = "Person";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3 == s4);


        StringBuffer sb = new StringBuffer("Hyderabad");
        StringBuffer sb2 = new StringBuffer("Hyderabad");

        System.out.println(sb == sb2);
        System.out.println(sb.equals(sb2));

    }
}
