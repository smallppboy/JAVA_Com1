package Chapter7;

/**
 * Created by ZhuangFang on 2015/7/9.
 */
class A1 {
    int i,j;
    A1 (int a,int b) {
        i = a;
        j = b;
    }

    //display i and j
    void show(){
        System.out.println("i and j: "+i+" "+j);
    }
}

class B1 extends A1 {
    int k;

    B1(int a, int b, int c) {
        super(a, b);
        k =c;
    }

    // display k - this overrides show() in A
    void show() {
        super.show();
        System.out.println("k: "+k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B1 subOb = new B1(1,2,3);

        subOb.show("This is k: "); // call show() in B
        subOb.show(); // call show() in A
    }
}
