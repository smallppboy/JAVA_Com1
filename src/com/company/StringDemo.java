package com.company;

/**
 * Created by AndyTrump on 5/12/2015.
 */
public class StringDemo {
    public static void main(String[] args) {
        //declare string in various ways
        String str1 = new String("Java Strings are objects.");
        String str2 = "They are constructed various ways.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3 + "2");
    }
}
