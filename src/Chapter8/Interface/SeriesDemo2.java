package Chapter8.Interface;

/**
 * Created by ZhuangFang on 2015/8/15.
 */
public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i=0; i<5; i++){
            ob =twoOb;
            System.out.println("Next ByTwos value is "+ ob.getNext());

            ob =threeOb;
            System.out.println("Next ByThrees value is "+ ob.getNext());

        }
    }
}
