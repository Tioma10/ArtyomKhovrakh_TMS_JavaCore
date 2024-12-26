package lesson9.homework.taks2;

public class Circle extends Figure {
    private final double pi = 3.1415926535897932384626433832795;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.pi * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * this.pi * this.radius;
    }
}
