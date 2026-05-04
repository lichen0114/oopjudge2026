/**
 * Represents a regular triangle shape.
 * The length represents the side length of the triangle.
 */
public class Triangle extends Shape {

    /**
     * Constructs a Triangle object with the given side length.
     *
     * @param length the side length of the regular triangle
     */
    public Triangle(double length) {
        setLength(length);
    }

    /**
     * Sets the side length of the regular triangle.
     *
     * @param length the side length to set
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and returns the area of the regular triangle.
     *
     * @return the area of the regular triangle
     */
    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length / 4.0;
    }

    /**
     * Calculates and returns the perimeter of the regular triangle.
     *
     * @return the perimeter of the regular triangle
     */
    @Override
    public double getPerimeter() {
        return 3.0 * length;
    }
}