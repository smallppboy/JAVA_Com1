package Chapter7;

/**
 * Created by ZhuangFang on 2015/6/30.
 */

class Triangles extends TwoDShape {
    private String style;

    //A default constructor
    Triangles() {
        super();
        style = "none";
    }

    //A 2 arguments constructor
    Triangles(String s, double w, double h) {
        // setWidth(w);
        // setHeight(h);
        super(w, h,"triangle");

        style =s;
    }

    //A one argument constructor
    Triangles(double x) {
        super(x,"triangle");
        style = "filled";
    }

    Triangles(Triangles ob) {
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


public class Shape3 {
    public static void main(String[] args) {
        Triangles t1 = new Triangles("filled",4.0,4.0);
        Triangles t2 = new Triangles("outlined",8.0,12.0);

        System.out.println("Info for t1(shape3): ");
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
