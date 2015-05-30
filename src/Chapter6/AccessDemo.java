package Chapter6;

/**
 * Created by ZhuangFang on 2015/5/30.
 */
public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setAlpha(-99);
        System.out.println("ob.alpha is "+ob.getAlpha());

 //       ob.alpha = 10;
        ob.beta = 88;
        ob.gamma = 99;
    }
}
