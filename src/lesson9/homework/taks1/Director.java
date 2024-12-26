package lesson9.homework.taks1;

public class Director implements ConclusionPosition {
    private final String name;
    private final String surname;
    private final String position;

    public Director(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    @Override
    public void conclusionPosition() {
        System.out.println(this.position);
    }
}
