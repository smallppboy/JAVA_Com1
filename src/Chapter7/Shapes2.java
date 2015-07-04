package Chapter7;

/**
 * Created by ZhuangFang on 2015/6/24.
 */

class TwoDShape {
    private double width;
    private double height;

    TwoDShape() {
        width = height = 0.0;
    }

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
    }

    //Construct object with equal width and height.
    TwoDShape(double x) {
        width = height = x;
    }

    void showDim(){
        System.out.println("Width and height are " +
                            width + " and " + height);
    }

    double getWidth (){return width;}

    void setWidth (double w){width = w;}

    double getHeight() {
        return height;
    }

    void setHeight (double h){height = h;}
}

// a subclass of TwoDShape for triangles.

class Triangle extends TwoDShape {
    String style;

    double area() {
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Triangle is "+style);
    }
}

public class Shapes2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style="filled";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style="outlined";

        System.out.println("Info for t1(shape2): ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is "+t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+t2.area());
    }
}
