package lesson8.homework;

public class Dog extends Predator {
    private final String name;
    private final int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Dog growling");

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
        return "Dog: \n" +
                "\t Name: " + name +
                "\t Weight: " + weight;
    }
}
