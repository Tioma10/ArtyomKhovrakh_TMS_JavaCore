package lesson7.homework;

public class Doctor {
    private String surname;
    private String name;
    private String speciality;

    public Doctor(String surname, String name, String speciality) {
        this.surname = surname;
        this.name = name;
        this.speciality = speciality;
    }

    public void treat() {
        System.out.println("General treat method");
    }
}
