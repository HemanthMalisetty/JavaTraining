package com.string;

public class StringDemo {
    public static void main(String[] args) {
        //String str = "Selenium";

        String str = new String("Selenium");
        str.concat("Automation");
        System.out.println(str);
        String subStr = str.substring(2, 6);
        System.out.println(subStr);


        /**
         * declaring stringBuffer
         * appending to stringBuffer
         * printing the output
         */
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);

        String st = sb.substring(0, 4);
        System.out.println(st);
        //jdhjsjsjsj


    }
}
