package Chapter6;

/**
 * Created by ZhuangFang on 2015/6/16.
 */
public class VarArgs {

    static void vaTest(int ...v){
        System.out.println("Number of args: "+v.length);
        System.out.println("Contents: ");

        for (int i=0; i<v.length;i++)
            System.out.println("    arg "+i+": "+v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
        vaTest(45,2,1,2,1,3,4,5);
    }
}
