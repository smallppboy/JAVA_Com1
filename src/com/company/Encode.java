package com.company;

/**
 * Created by AndyTrump on 5/19/2015.
 */
public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 0x11;

        System.out.print("Original message: ");
        System.out.println(msg);

        //encode the message

        for (int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        for (int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print(" Decoded message: ");
        System.out.println(decmsg);


    }
}
