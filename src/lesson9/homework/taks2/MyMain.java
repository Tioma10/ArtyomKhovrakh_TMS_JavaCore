package lesson9.homework.taks2;

public class MyMain {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Triangle(7.2, 5.5, 8.2, 2.2),
                new Rectangle(8.0, 10.0),
                new Circle(5.5),
                new Circle(6.0),
                new Circle(7.0)
        };

        double countPerimeters = 0;
        for (Figure figure : figures) {
            countPerimeters += figure.calculatePerimeter();
        }

        System.out.println(countPerimeters);

    }
}
