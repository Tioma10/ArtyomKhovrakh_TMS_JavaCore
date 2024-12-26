package lesson9.homework.taks2;

public class Rectangle extends Figure {
    private final double length;
    private final double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return (this.length + this.width) / 2;
    }
}
