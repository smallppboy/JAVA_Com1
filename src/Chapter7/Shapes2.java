package Chapter7;

import org.w3c.dom.css.Rect;

/**
 * Created by ZhuangFang on 2015/6/24.
 */

class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape() {
        width = height = 0.0;
        name ="none";
    }

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
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
    double getHeight() {
        return height;
    }

    void setWidth (double w){width = w;}
    void setHeight (double h){height = h;}

    String getName(){return name;};

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
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

class Rectangle extends TwoDShape {
    Rectangle(){
        super();
    }

    //Constructor for Rectangle.
    Rectangle(double w,double h){
        super(w,h,"rectangle");
    }

    //Construct a square
    Rectangle(double x){
        super(x,"rectangle"); // call superclass constructor
    }

    //Constructor an object from an object.
    Rectangle(Rectangle ob){
        super(ob);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    // Override area() for Rectangle
    double area(){
        return getWidth()*getHeight();
    }
}

class DynShapre {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangles("outlined",8.0,12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangles(7.0);
        shapes[4] = new TwoDShape(10,20,"generic");

        for (int i=0; i<shapes.length; i++){
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
