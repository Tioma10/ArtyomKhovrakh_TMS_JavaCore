package lesson8.homework;

public class Rabbit extends Herbivore {
    private final String name;
    private final int weight;

    public Rabbit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Rabbit snorting");

    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass") || food.equals("Carrot")) {
            System.out.println("I'm happy!");
        } else {
            System.out.println("I'm not eating " + food);
        }

    }

    @Override
    public String toString() {
        return "Rabbit: \n" +
                "\t Name: " + name +
                "\t Weight: " + weight;
    }
}
