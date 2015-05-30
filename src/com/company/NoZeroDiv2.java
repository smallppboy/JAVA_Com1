package com.company;

/**
 * Created by ZhuangFang on 2015/5/25.
 */
public class NoZeroDiv2 {
    public static void main(String[] args) {

        for (int i=-5;i<6;i++){
//            result = i != 0 ? 100/i:0;
            if(i!=0?true:false)
                System.out.println("100 /" + i + " is "+100/i);
        }
    }
}
