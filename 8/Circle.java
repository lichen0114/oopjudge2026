/**
 * Represents a circle shape.
 * The length represents the diameter of the circle.
 */
public class Circle extends Shape {

    /**
     * Constructs a Circle object with the given diameter.
     *
     * @param length the diameter of the circle
     */
    public Circle(double length) {
        super(length);
        setLength(length);
    }

    /**
     * Sets the diameter of the circle.
     *
     * @param length the diameter to set
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return the area of the circle
     */
    @Override
    public double getArea() {
        double radius = length / 2.0;
        return Math.PI * radius * radius;
    }

    /**
     * Calculates and returns the perimeter of the circle.
     *
     * @return the perimeter of the circle
     */
    @Override
    public double getPerimeter() {
        return Math.PI * length;
    }
}