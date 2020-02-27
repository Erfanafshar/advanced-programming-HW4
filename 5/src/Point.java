/**
 * The point class have a point coordinates
 * And we can change them after initialize
 * *
 * @author Erfan
 * @version 1
 */
public class Point {

    // filed //

    // The x position of point
    public int xPosition;

    // The y position of point
    public int yPosition;

    // constructor //

    /**
     * Generate a point
     */
    public Point(){

    }

    /**
     * Generate a point with given x Position and y Position
     * *
     * @param x The x position of point
     * @param y The y position of point
     */
    public Point(int x, int y) {
        xPosition = x ;
        yPosition = y ;
    }

    // method //

    /**
     * Set x position of point
     * @param x The x position of point
     */
    public void setxPosition(int x) {
        xPosition = x;
    }

    /**
     * Set y position of point
     * @param y The y position of point
     */
    public void setyPosition(int y) {
        yPosition = y;
    }

}
