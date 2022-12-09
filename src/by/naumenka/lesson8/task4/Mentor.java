package by.naumenka.lesson8.task4;

import by.naumenka.lesson8.task4.Faculty.Faculty;

import static by.naumenka.lesson8.task4.Faculty.Utils.Constants.RANDOM;

public class Mentor { //список предметов и факультетов
    private Subject[] subjects = new Subject[4];
    private Faculty[] faculties = new Faculty[2];

    private long id;
    private String name;
    private String secondName;
    private String lastName;

    public Mentor(String name, String secondName, String lastName) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.id = Math.abs(RANDOM.nextLong());
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }

    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }
}
