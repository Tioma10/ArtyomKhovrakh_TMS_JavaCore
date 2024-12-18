package lesson7.homework;

public class Surgeon extends Doctor {
    public Surgeon(String surname, String name, String speciality) {
        super(surname, name, speciality);
    }


    @Override
    public void treat() {
        System.out.println("Surgeon treats");
    }


}
