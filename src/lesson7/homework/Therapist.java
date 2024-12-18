package lesson7.homework;

public class Therapist extends Doctor {
    public Patient patient;

    public Therapist(String surname, String name, String speciality) {
        super(surname, name, speciality);

    }

    @Override
    public void treat() {
        System.out.println("Therapist treats");

    }

    public void prescribeTreatmentPlan(Patient patient) {
        if (patient.treatmentPlan == 1) {
            patient.doctor = new Surgeon("Ivanov", "Vatly", "Surgeon");
            patient.doctor.treat();

        }
        if (patient.treatmentPlan == 2) {
            patient.doctor = new Dentist("Petrov", "Artyom", "Dentist");
            patient.doctor.treat();
        }
        if (patient.treatmentPlan > 2) {
            patient.doctor = this;
            patient.doctor.treat();
        }
    }
}
