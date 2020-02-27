/**
 * The Run class for make objects and continue the program
 * *
 * @author Erfan
 * @version 1
 */
public class Run {

    // method //

    /**
     * The main class for make objects and continue the program
     * @param args The input parameter of main method
     */
    public static void main(String[] args) {

        // 1
        Point p1 = new Point(2,3);
        Circle c1 = new Circle(2 ,p1);
        //System.out.println("x : " + c1.p.xPosition + " - " + "y : " + c1.p.yPosition );
        p1.setxPosition(7);
        p1.setyPosition(5);
        //System.out.println("x : " + c1.p.xPosition + " - " + "y : " + c1.p.yPosition );

        // 2
        Point p2 = new Point(0,0);
        Square s1 = new Square(4 , p2 );
        //System.out.println("x : " + s1.p.xPosition + " - " + "y : " + s1.p.yPosition );
        s1.setP(p1);
        //System.out.println("x : " + s1.p.xPosition + " - " + "y : " + s1.p.yPosition );


        // This section is explained in the appendix
        s1.setP(p2);
        //System.out.println("x : " + s1.p.xPosition + " - " + "y : " + s1.p.yPosition );


        // 3
        Point p3 = new Point(1,1);
        Rectangle.p = p3 ;
        Rectangle r1 = new Rectangle(5 , 3);
        Rectangle r2 = new Rectangle(7 , 6);
        //System.out.println("x : " + r1.p.xPosition + " - " + "y : " + r1.p.yPosition );
        r2.setP(p1);
        //System.out.println("x : " + r1.p.xPosition + " - " + "y : " + r1.p.yPosition );


        // This section is explained in the appendix
        //System.out.println(p2.xPosition);
        //System.out.println(p2.yPosition);


        // 4
        System.out.println("circle 1 Perimeter : " + c1.calculatePerimeter());
        System.out.println("circle 1 area : " + c1.calculateArea());
        System.out.println();
        System.out.println("Square 1 Perimeter : " + s1.calculatePerimeter());
        System.out.println("Square 1 area : " + s1.calculateArea());
        System.out.println();
        System.out.println("Rectangle 1 Perimeter : " + r1.calculatePerimeter());
        System.out.println("Rectangle 1 area : " + r1.calculateArea());
        System.out.println();
        System.out.println("Rectangle 2 Perimeter : " + r2.calculatePerimeter());
        System.out.println("Rectangle 2 area : " + r2.calculateArea());
        System.out.println();

        // 5

        // This section is explained in the appendix
    }
}
