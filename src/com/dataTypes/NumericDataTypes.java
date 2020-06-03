package com.dataTypes;

public class NumericDataTypes {
    public static void main(StringDemo[] args) {
        byte smallNumber;
        smallNumber = 2;
        smallNumber = 127;

        System.out.println(smallNumber);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        short shortNumber = 12;

        System.out.println(shortNumber);
        System.out.println("Short Min Value " + Short.MIN_VALUE);
        System.out.println("Short Max Value " + Short.MAX_VALUE);

        int intNumber = 234;

        System.out.println(intNumber);
        System.out.println("int Min Value " + Integer.MIN_VALUE);
        System.out.println("int Max Value " + Integer.MAX_VALUE);

        long phoneNumber = 7204200664L;

        System.out.println(phoneNumber);
        System.out.println("Long Min Value " + Long.MIN_VALUE);
        System.out.println("Long Max Value " + Long.MAX_VALUE);




    }
}
