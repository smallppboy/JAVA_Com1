package Chapter7;

/**
 * Created by AndyTrump on 7/4/2015.
 */

class Triangles4 extends TwoDShape {
    private String style;

    Triangles4(String s, double w, double h) {
        super(w, h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

public class Shape4 {
    public static void main(String[] args) {
        Triangles4 t1 = new Triangles4("filled", 4.0, 4.0);
        Triangles4 t2 = new Triangles4("outlined", 8.0, 12.0);

        System.out.println("Info for t1(shape4): ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }

}
