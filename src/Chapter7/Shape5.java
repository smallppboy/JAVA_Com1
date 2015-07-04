package Chapter7;

/**
 * Created by AndyTrump on 7/4/2015.
 */
public class Shape5 {
    public static void main(String[] args) {
        Triangles t1 = new Triangles();
        Triangles t2 = new Triangles("outlined", 8.0, 12.0);
        Triangles t3 = new Triangles(4.0);

        t1 = t2;
        System.out.println("Info for t1(shape5): ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
    }


}
