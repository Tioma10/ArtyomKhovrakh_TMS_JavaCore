package lesson9.homework.taks2;

public class Triangle extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;
    private final double height;

    public Triangle(double firstSide, double secondSide, double thirdSide, double height) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (this.thirdSide * this.height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;
    }
}
