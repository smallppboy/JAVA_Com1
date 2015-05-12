package com.company;

/**
 * Created by AndyTrump on 5/12/2015.
 */
public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This", "is", "a", "test."};

        System.out.println("Original arrays: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("");

        //change a string
        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.println("Modified array: ");
        for (String s : strs)
            System.out.print(s + " ");
    }
}
