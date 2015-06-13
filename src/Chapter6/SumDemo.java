package Chapter6;

/**
 * Created by ZhuangFang on 2015/6/7.
 */

class Summation{
    int sum;

    // Construct form an int.
    Summation(int num){
        sum = 0;
        for(int i=1; i<=num;i++)
            sum+=i;
    }

    Summation(Summation ob){    // Use another object to Construct
        sum = ob.sum;
    }
}

public class SumDemo {
    public static void main(String[] args) {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum "+ s1.sum);
        System.out.println("s2.sum "+ s2.sum);
    }
}
