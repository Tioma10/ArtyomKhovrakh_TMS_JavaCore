package lesson8.homework;

public class Tiger extends Predator{
    private final String name;
    private final int weight;

    public Tiger(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Tiger growling");

    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("I'm happy!");
        } else {
            System.out.println("I'm not eating " + food);
        }

    }

    @Override
    public String toString() {
        return "Tiger: \n" +
                "\t Name: " + name +
                "\t Weight: " + weight;
    }
}
