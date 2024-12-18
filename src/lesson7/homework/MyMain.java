package lesson7.homework;

public class MyMain {
    public static void main(String[] args) {
        Patient patient = new Patient(2);
        Therapist therapist = new Therapist("Vasiliev", "Vasya", "Therapist");
        therapist.prescribeTreatmentPlan(patient);
    }
}
