package Chapter7;

/**
 * Created by ZhuangFang on 2015/7/19.
 */

abstract class TwoDShapeS {
    private double width;
    private double height;
    private String name;

    TwoDShapeS() {
        width = height = 0.0;
        name ="none";
    }

    TwoDShapeS(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShapeS(double x, String n) {
        width = height = x;
        name = n;
    }
    TwoDShapeS(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShapeS(TwoDShapeS ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    //Construct object with equal width and height.
    TwoDShapeS(double x) {
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


    abstract double area();
}

class TriangleS extends TwoDShapeS {
    private String style;

    // A default constructor
    TriangleS() {
        super();
        style = "none";
    }


    //A 2 arguments constructor
    TriangleS(String s, double w, double h) {
        // setWidth(w);
        // setHeight(h);
        super(w, h,"triangle");

        style =s;
    }

    //A one argument constructor
    TriangleS(double x) {
        super(x,"triangle");
        style = "filled";
    }

    TriangleS(TriangleS ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Triangle is "+style);
    }

}

class RectangleS extends TwoDShapeS {
    RectangleS(){
        super();
    }

    //Constructor for Rectangle.
    RectangleS(double w,double h){
        super(w,h,"rectangleS");
    }

    //Construct a square
    RectangleS(double x){
        super(x,"rectangleS"); // call superclass constructor
    }

    //Constructor an object from an object.
    RectangleS(RectangleS ob){
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

class CircleS extends TwoDShapeS {
    final double PI = 3.142;
    CircleS() {
        super();
    }

    //Construct a square
    CircleS(double x){
        super(x,"CircleS"); // call superclass constructor
    }

    // Override area() for Rectangle
    double area(){
        return PI*Math.pow((getWidth() / 2), 2);
    }


}

public class AbsShape {
    public static void main(String[] args) {
        TwoDShapeS shapes[] = new TwoDShapeS[5];

        shapes[0] = new TriangleS("outlined",8.0,12.0);
        shapes[1] = new RectangleS(10);
        shapes[2] = new RectangleS(10,4);
        shapes[3] = new TriangleS(7.0);
        shapes[4] = new CircleS(6.0);
     //   shapes[4] = new TwoDShapeS(10,20,"generic");

        for (int i=0; i<shapes.length; i++){
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
