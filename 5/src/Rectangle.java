/**
 * The Rectangle class can generate Rectangles
 * With the up and left point and length and width
 * *
 * @author Erfan
 * @version 1
 */
public class Rectangle {

    // filed //

    // The position of the up and left point of the Rectangle
    public static Point p = new Point();

    // The length of the Rectangle
    private int length;

    // The width of the Rectangle
    private int width;

    // constructor //

    /**
     * Generate a Rectangle with given Length and width and x Position and y Position of up and left point
     * @param lengh  The length of the Rectangle
     * @param widt The width of the Rectangle
     */
    public Rectangle(int lengh, int widt){
        length = lengh;
        width = widt;
    }

    // method //

    /**
     * Set or change the length of the Rectangle
     * @param lentg The length of the Rectangle
     */
    public void setLength(int lentg) {
        length = lentg;
    }

    /**
     * Set or change the width of the Rectangle
     * @param widt The side width  of the Rectangle
     */
    public void setWidth(int widt) {
        width = widt;
    }

    /**
     * Set or change the position of the Rectangle
     * @param po The position of the up and left point of the Rectangle
     */
    public void setP (Point po){
        p.setxPosition(po.xPosition);
        p.setyPosition(po.yPosition);
    }

    /**
     * Set or change the x position of the Rectangle
     * @param x The x position of the up and left point of the Rectangle
     */
    public void setX(int x) {
        p.setxPosition(x);
    }

    /**
     * Set or change the y position of the Rectangle
     * @param y The y position of the up and left point of the Rectangle
     */
    public void setY(int y) {
        p.setyPosition(y);
    }

    /**
     * This method calculate Perimeter of the Rectangle and return it
     * @return The Perimeter of the Rectangle
     */
    public int calculatePerimeter() {
        return (width * 2 + length * 2);
    }

    /**
     * This method calculate Area of the Rectangle  and return it
     * @return The Area of the Rectangle
     */
    public int calculateArea() {
        return width * length;
    }

}
