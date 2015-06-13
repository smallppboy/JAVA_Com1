package Chapter6;


/**
 * Created by ZhuangFang on 2015/6/7.
 */
public class QDemo2 {
    public static void main(String[] args) {
        Queue q1 = new Queue(10);

        char name[] = {'T','o','m'};
        Queue q2 = new Queue(name);

        char ch;
        int i;

        //put some characters into q1
        for(i=0;i<5;i++)
            q1.put((char) ('A' + i));

        // construct queue from another queue
        Queue q3 =new Queue(q1);

        //put some characters into q1
        for(i=0;i<5;i++)
            q1.put((char) ('F' + i));



        // Show the queues.
        System.out.print("Contents of q1: ");
        for(i=0; i<10;i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for (i=0;i<3;i++){
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for(i=0; i<10;i++) {
            ch = q3.get();
            System.out.print(ch);
        }

    }
}
