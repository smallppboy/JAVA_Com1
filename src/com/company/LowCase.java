package com.company;

/**
 * Created by AndyTrump on 5/19/2015.
 */
public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // This statement turns on the 6th bit.
            ch = (char) ((int) ch | 32);

            System.out.print(ch + " ");
        }
    }
}
