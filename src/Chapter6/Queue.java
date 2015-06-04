package Chapter6;

/**
 * Created by ZhuangFang on 2015/6/3.
 */
class Queue {
    private char q[]; // this array holds the queue
    private int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // put a char into the queue
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // get a char from the queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty. ");
            return (char) 0;
        }
        return q[getloc++];
    }
}