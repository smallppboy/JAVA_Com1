package Chapter7;

/**
 * Created by AndyTrump on 7/4/2015.
 */
public class Shape7 {
    public static void main(String[] args) {
        Triangles t1 = new Triangles("outlined", 8.0, 12.0);

        // Make a copy of t1
        Triangles t2 = new Triangles(t1);

        System.out.println("Info for t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }

}
