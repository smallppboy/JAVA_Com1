package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by AndyTrump on 5/4/2015.
 */
class FDemo {
    int x;

    FDemo(int i){
        x=i;
    }

    //called when object is recycled
    protected void finalize(){
        System.out.println("Finalizing "+x);
    }

    void generator(int i){
        FDemo o =new FDemo(i);
    }
}
public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

        for(count=1;count<1000000;count++){
            ob.generator(count);
        }
    }
}
