package Chapter6;

import com.sun.org.apache.xpath.internal.SourceTree;

//Chapter6/FSDemo.java:10

/**
 * Created by ZhuangFang on
 * /5/31.
 */
public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5,-1);
        int x;

        // show quiet failures
        System.out.println("Fail quietly.");
        for(int i=0; i<(fs.length*2);i++){
            fs.put(i,i*10);
        }

        for(int i=0; i<(fs.length*2);i++){
            x = fs.get(i);
            if (x!=-1) System.out.print(x + " ");
        }
        System.out.println("");

        // handle failure
        System.out.println("\nFail with error reports.");
        for(int i=0;i<(fs.length *2); i++)
            if(!fs.put(i,i*10))
                System.out.println("Index "+i+" out-of-bounds");

        for(int i=0;i<(fs.length *2); i++){
            x= fs.get(i);
            if(x!=-1) System.out.print(x+" ");
            else
                System.out.println("Index "+i+" out-of-bounds");
        }
    }
}
