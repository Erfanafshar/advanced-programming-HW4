/**
 * The Square class can generate Squares
 * With the up and left point and the side length
 * *
 * @author Erfan
 * @version 1
 */
public class Square {

    // filed //

    // The position of the up and left point of the Square
    Point p = new Point();

    // The side length of the Square
    private int sideLength;

    // constructor //

    /**
     * Generate a Square with given side Length and x Position and y Position of up and left point
     * @param length The side length of the Square
     * @param pnt The position of the up and left point of the Square
     */
    public Square (int length , Point pnt){
        sideLength = length ;
        p.setxPosition(pnt.xPosition);
        p.setyPosition(pnt.yPosition);
    }

    // method //

    /**
     * Set or change the side length of the Square
     * @param length The side length of the Square
     */
    public void setSideLength(int length) {
        sideLength = length;
    }

    /**
     * Set or change the position of the Square
     * @param po The position of the up and left point of the Square
     */
    public void setP (Point po){
        p.setxPosition(po.xPosition);
        p.setyPosition(po.yPosition);
    }

    /**
     * Set or change the x position of the Square
     * @param x The x position of the up and left point of the Square
     */
    public void setX(int x) {
        p.setxPosition(x);
    }

    /**
     * Set or change the y position of the Square
     * @param y The y position of the up and left point of the Square
     */
    public void setY(int y) {
        p.setyPosition(y);
    }

    /**
     * This method calculate Perimeter of the Square and return it
     * @return The Perimeter of the Square
     */
    public int calculatePerimeter() {
        return sideLength * 4;
    }

    /**
     * This method calculate Area of the Square and return it
     * @return The Area of the Square
     */
    public int calculateArea() {
        return sideLength * sideLength;
    }
}
