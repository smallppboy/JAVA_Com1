package Chapter8.Interface;

/**
 * Created by ZhuangFang on 2015/8/16.
 */
public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        IcharQ iQ;

        char ch;
        int i;

        iQ = q1;
        //Put some chars into fixed queue.

        for(i=0; i<10; i++)
            iQ.put((char) ('A'+i));

        //Show the queue.
        System.out.print("Contents of fixed queue: ");
        for(i=0; i<10; i++) {
            ch=iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ=q2;

        //Put some chars into dynamic queue.
        for(i=0;i<10;i++)
            iQ.put((char)('Z'-i));

        // Show the queue.
        System.out.print("Contents of dynamic queue: ");
        for (i=0; i<10;i++){
            ch=iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ =q3;
        //Put some char into circular queue.
        for(i=0;i<10;i++)
            iQ.put((char)('A'+i));

        //show
        System.out.print("Contents of circular queue: ");
        for(i=0;i<10;i++) {
            ch=iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        //Put more char into circular queue.
        for(i=10;i<20;i++)
            iQ.put((char)('A'+i));

        //show
        System.out.print("Contents of circular queue: ");
        for(i=0;i<10;i++) {
            ch=iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nStore and consume from"+" circular queue.");

        // Store in and consume from circular queue.
        for(i=0; i<20; i++){
            iQ.put((char) ('A'+i));
            ch=iQ.get();
            System.out.print(ch);
        }

    }
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
        q= new char[size+1];
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

class DynQueue implements IcharQ {
    private char q[];
    private int putloc,getloc;

    public DynQueue(int size){
        q=new char[size];
        putloc=getloc=0;
    }

    //put a character into the queue.

    public void put(char ch){
        if(putloc == q.length) {
            char t[]=new char [q.length*2];

            for (int i=0;i<q.length;i++)
                t[i] = q[i];
            q=t;
        }
        q[putloc++]=ch;
    }

    public char get(){
        if (getloc==putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
       return q[getloc++];
    }
}