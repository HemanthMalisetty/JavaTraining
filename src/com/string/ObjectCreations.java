package com.string;

public class ObjectCreations {

    public static void main(String[] args) {
        String s1 = new String("Spring");
        s1.concat("Fall");
        String s2 = s1.concat("winter");
        s2.concat("summer");

        System.out.println(s1);
        System.out.println(s2);

    }
}
