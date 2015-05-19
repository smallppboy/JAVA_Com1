package com.company;

/**
 * Created by AndyTrump on 5/19/2015.
 */
public class UpCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            //This statement turns off the 6th bit.
            //         ch = (char)((int)ch&65503) ; // ch is now uppercase
            ch = (char) (ch & 223); // ch is now uppercase

            System.out.print(ch + " ");
        }
    }
}
