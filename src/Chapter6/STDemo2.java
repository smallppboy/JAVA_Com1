package Chapter6;

/**
 * Created by ZhuangFang on 2015/6/22.
 */
class Stacks {

    private char st[]; // this array holds the queue
    private int pushloc, poploc;

    Stacks(int size) {
        st = new char[size];
        pushloc = poploc = 0;
    }

    // Construct a Queue with initial values.
    Stacks (char a[]) {
        pushloc = 0;
        poploc = 0;
        st = new char[a.length];

        for(int i=0; i<a.length; i++) push(a[i]);
    }

    // push a char into the queue
    void push(char ch) {
        if (pushloc == st.length) {
            System.out.println(" - Stack is full.");
            return;
        }
        st[pushloc++] = ch;
    }

    // get a char from the queue
    char pop() {
        if (poploc == pushloc) {
            System.out.println(" - Stack is empty. ");
            return (char) 0;
        }
        return st[poploc++];
    }
}

public class STDemo2 {
    public static void main(String[] args) {
        Stacks s1 = new Stacks(10);

        char name[] = {'T','o','m'};
        Stacks s2 = new Stacks(name);

        char ch;
        int i;

        //put some characters into q1
        for(i=0;i<10;i++)
            s1.push((char) ('A' + i));

 /*       // construct queue from another queue
        Queue s3 =new Queue(s1);

        //put some characters into q1
        for(i=0;i<5;i++)
            s1.push((char) ('F' + i));
*/


        // Show the queues.
        System.out.print("Contents of s1: ");
        for(i=0; i<10;i++) {
            ch = s1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of s2: ");
        for (i=0;i<3;i++){
            ch = s2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

/*        System.out.print("Contents of q3: ");
        for(i=0; i<10;i++) {
            ch = q3.get();
            System.out.print(ch);
        }
*/

    }
}