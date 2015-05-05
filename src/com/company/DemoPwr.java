package com.company;

/**
 * Created by AndyTrump on 5/5/2015.
 */
class Pwr{
    double b;
    int e;
    double val;

    Pwr(double base,int exp){
        b=base;
        e=exp;

        val=1;
        if(exp==0) return;
            for (;exp>0;exp--)
                val=val*base;
        }
        double get_pwr(){
            return val;
        }
}
public class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0,2);
        Pwr y = new Pwr(2.5,4);
        Pwr z = new Pwr(5.7,0);
        System.out.println(x.b+" raised to the "+x.e+" Power is "+x.get_pwr());
        System.out.println(y.b+" raised to the "+y.e+" Power is "+y.get_pwr());
        System.out.println(z.b+" raised to the "+z.e+" Power is "+z.get_pwr());
    }
}
