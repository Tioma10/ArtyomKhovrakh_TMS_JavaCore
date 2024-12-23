package lesson8.homework;

public class MyMain {
    public static void main(String[] args) {
        createAnimal(new Rabbit("Prygskok", 3));
        createAnimal(new Dog("Sharik", 20));
        createAnimal(new Tiger("Timur", 200));
    }

    public static void createAnimal(Animal animal)
    {
        animal.voice();
        animal.eat("meat");
    }
}

