/**
 * The circle class can generate circles
 * With a Center and radius
 * *
 * @author Erfan
 * @version 1
 */
public class Circle {

    // field //

    // The position of the center of the circle
    Point p = new Point();

    // The radius of the circle
    private int radius;

    // constructor //

    /**
     * Generate a circle with given radius and x Position and y Position
     * *
     * @param rad The radius of the circle
     * @param pnt The position of the center of the circle
     */
    public Circle (int rad , Point pnt){
        radius = rad ;
        p.setxPosition(pnt.xPosition);
        p.setyPosition(pnt.yPosition);
    }

    // method //

    /**
     * Set or change the radius of the circle
     * @param rad The radius of the circle
     */
    public void setRadius(int rad) {
        radius = rad;
    }

    /**
     * Set or change the x Position of the circle
     * @param x The x position of the center of the circle
     */
    public void setX(int x) {
        p.setxPosition(x);
    }

    /**
     * Set or change the y Position of the circle
     * @param y The y position of the center of the circle
     */
    public void setY(int y) {
        p.setyPosition(y);
    }

    /**
     * This method calculate Perimeter of the circle and return it
     * @return The Perimeter of the circle
     */
    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

    /**
     * This method calculate Area of the circle and return it
     * @return The Area of the circle
     */
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

}
