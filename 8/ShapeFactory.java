/**
 * A factory class used to create Shape objects.
 * It supports creating Triangle, Square, and Circle objects.
 */
public class ShapeFactory {

    /**
     * Represents the available types of shapes.
     */
    public enum Type {
        /**
         * Represents a regular triangle.
         */
        Triangle,

        /**
         * Represents a square.
         */
        Square,

        /**
         * Represents a circle.
         */
        Circle
    }

    /**
     * Creates a Shape object according to the given shape type and length.
     *
     * @param shapeType the type of shape to create
     * @param length    the side length of the triangle or square, or the diameter
     *                  of the circle
     * @return a Shape object of the requested type
     */
    public Shape createShape(ShapeFactory.Type shapeType, double length) {
        if (shapeType == ShapeFactory.Type.Triangle) {
            return new Triangle(length);
        } else if (shapeType == ShapeFactory.Type.Square) {
            return new Square(length);
        } else if (shapeType == ShapeFactory.Type.Circle) {
            return new Circle(length);
        }

        return null;
    }
}