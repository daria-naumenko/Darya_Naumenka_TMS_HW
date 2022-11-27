package by.naumenka.task2;

public class Patient {
    private String name;
    private int age;
    private int treatmentPlan;

    public Patient(String name, int age, int treatmentPlan) {
        this.name = name;
        this.age = age;
        this.treatmentPlan = treatmentPlan;
    }

    protected void TreatmentPlan(int treatmentPlan) {
        if (treatmentPlan == 1) {
            System.out.println("План лечения: направление к хирургу");
        } else if (treatmentPlan == 2) {
            System.out.println("План лечения: направление к стоматологу");
        } else {
            System.out.println("План лечения: направление к терапевту");
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", TreatmentPlan=" + treatmentPlan +
                '}';
    }
}