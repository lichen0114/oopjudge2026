/**
 * Represents a square shape.
 * The length represents the side length of the square.
 */
public class Square extends Shape {

    /**
     * Constructs a Square object with the given side length.
     *
     * @param length the side length of the square
     */
    public Square(double length) {
        super(length);
        setLength(length);
    }

    /**
     * Sets the side length of the square.
     *
     * @param length the side length to set
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and returns the area of the square.
     *
     * @return the area of the square
     */
    @Override
    public double getArea() {
        return length * length;
    }

    /**
     * Calculates and returns the perimeter of the square.
     *
     * @return the perimeter of the square
     */
    @Override
    public double getPerimeter() {
        return 4.0 * length;
    }
}