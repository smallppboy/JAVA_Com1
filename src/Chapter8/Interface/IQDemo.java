package Chapter8.Interface;

/**
 * Created by ZhuangFang on 2015/8/16.
 */
public class IQDemo {
}

class FixedQueue implements IcharQ {
    private char q[]; // this array holds the queue
    private int putloc,getloc; // the put and get indices

    // Construct an empty queue given its size.
    public FixedQueue(int size) {
        q= new char[size];
        putloc=getloc=0;
    }

    public void put (char ch){
        if(putloc==q.length){
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++]=ch;
    }

    //Get a character from the queue.
    public char get() {
        if (getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

}

class CircularQueue implements IcharQ {
    private char q[]; // this array holds the queue
    private int putloc,getloc; // the put and get indices

    // Construct an empty queue given its size.
    public CircularQueue(int size){
        q= new char[size];
        putloc=getloc=0;
    }

    // put a character into the queue.
    public void put(char ch) {
        /* Queue is full if either putloc is one less that getloc, or if putloc is at
        the end of the array and getloc is a the beginning.   */

        if(putloc+1==getloc|((putloc==q.length-1)&(getloc==0))){
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++]=ch;
        if(putloc==q.length) putloc=0;
    }

    public char get(){
        if (getloc==putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        char ch = q[getloc++];
        if(getloc==q.length) getloc=0; // loop back
        return ch;
    }

}