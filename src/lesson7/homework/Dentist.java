package lesson7.homework;

public class Dentist extends Doctor {
    public Dentist(String surname, String name, String speciality) {
        super(surname, name, speciality);
    }

    @Override
    public void treat() {
        System.out.println("Dentist treats");
    }
}
