package by.naumenka.lesson8.task4;

import by.naumenka.lesson8.task4.Faculty.Faculty;

import static by.naumenka.lesson8.task4.Faculty.Utils.Constants.NAME;

public class Univer {

    private String name = NAME;

    private Student[] students = new Student[100];
    private Faculty[] faculties = new Faculty[5];
    private Mentor[] mentors = new Mentor[20];


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }

    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }



    public void addStudent(String name, String secondName, String lastName, boolean payable, int groupNumber, Faculty faculty) {
        Student firstStudent = new Student( name, secondName, lastName, payable, groupNumber, faculty);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = firstStudent;
            }
        }
    }

    public void deleteStudents(long id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                students[i] = null;
            }
        }
    }
    public static void findStudent(Univer univer, String name, String lastName, String secondName, Faculty faculty){
        for (int i = 0; i < univer.getStudents().length; i++) {
            if (univer.getFaculties()[i].equals(faculty) &&
                    univer.getStudents()[i].getName().equals(name) &&
                    univer.getStudents()[i].getLastName().equals(lastName) &&
                    univer.getStudents()[i].getSecondName().equals(secondName)){
                System.out.println(univer.getStudents()[i]);
            }
        }
    }
}









