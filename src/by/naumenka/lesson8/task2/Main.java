package by.naumenka.lesson8.task2;

public class Main {
    public static void main(String[] args) {
        Doctor dentist = new Dentist();
        Doctor surgeon = new Surgeon();
        Doctor therapist = new Therapist();

        Patient firstPatient = new Patient("Максим", 24, 1);
        Patient secondPatient = new Patient("Милана", 13, 2);
        Patient thirdPatient = new Patient("Настя", 19, 3);

        System.out.println(firstPatient.toString());
        firstPatient.TreatmentPlan(1);
        surgeon.treatment();

        System.out.println(secondPatient.toString());
        secondPatient.TreatmentPlan(2);
        dentist.treatment();

        System.out.println(thirdPatient.toString());
        thirdPatient.TreatmentPlan(3);
        therapist.treatment();
    }
}