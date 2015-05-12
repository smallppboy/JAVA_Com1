package com.company;

/**
 * Created by AndyTrump on 5/10/2015.
 */

//        import java.util.Collection;
//       import java.util.Iterator;
//import java.util.Queue;

/**
 * Created by AndyTrump on 5/10/2015.
 */
class Queues {
    double q[]; // this array holds the queue
    int putloc, getloc;

    Queues(int size) {
        q = new double[size];
        putloc = getloc = 0;
    }

    // put a double value into the queue
    void put(double DValue) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = DValue;
    }

    // get a double value from the queue
    double get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty. ");
            return (double) 0;
        }
        return q[getloc++];
    }
}


public class QDemoDouble {
    public static void main(String[] args) {
        Queues bigQ = new Queues(100);
        Queues smallQ = new Queues(4);
        double Dvalue;
        double i;

        System.out.println("Using bigQ to store the alphabet");
        //put some numbers into bigQ
        for (i = 0.3000; i < 27.3000; i++)
            bigQ.put((1.1 + i));

        // retrieve and display elements from bigQ
        System.out.print("Contents of bigQ: ");
        for (i = 0.3000; i < 27.3000; i++) {
            Dvalue = bigQ.get();
            if (Dvalue != (double) 0) System.out.println(Dvalue);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for (i = 0.70000; i < 5.70000; i++) {
            System.out.print("Attempting to store " + (9.8 - i));
            smallQ.put((9.8 - i));
            System.out.println();
        }
        System.out.println();
        // more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for (i = 0.70000; i < 5.70000; i++) {
            Dvalue = smallQ.get();
            if (Dvalue != (double) 0) System.out.print(Dvalue);
        }
    }
}


