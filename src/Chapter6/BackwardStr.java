package Chapter6;

/**
 * Created by ZhuangFang on 2015/6/23.
 */

class strOperate {

    private String Forw;
    strOperate(String a){
        Forw = a;
    }

    String Rever() {
        return RevProc(Forw.length());
    }

    String RevProc(int n) {
        String RevResult;
        if(n==1) return Forw.substring(0,1);
        RevResult = Forw.substring(n-1,n).concat(RevProc(n-1));
        return RevResult;
    }


}
public class BackwardStr {
    public static void main(String[] args) {
        String str1 = "da";
        strOperate sto1 = new strOperate(str1);
        System.out.println("Reverse of " + str1 + " is: " + sto1.Rever());

    }

}
