package com.company;

/**
 * Created by AndyTrump on 5/3/2015.
 */
class MyClass {
    int x;

    MyClass(int i) {
        x=i;
    }
}
public class ParmConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x+"  "+t2.x);
    }
}
