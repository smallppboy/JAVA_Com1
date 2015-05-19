package com.company;

/**
 * Created by AndyTrump on 5/14/2015.
 */
public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "555-2323"},
                {"Mary", "555-2454"},
                {"Jony", "555-9875"},
                {"Rachel", "555-1456"},
        };
        int i;

        if (args.length != 1)
            System.out.println("Usage: java Phone <name>");
        else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " +
                            numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length)
                System.out.println("Name not found.");
        }
    }
}
