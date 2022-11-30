package by.naumenka.task4;

import by.naumenka.task4.Faculty.Faculty;

import static by.naumenka.task4.Faculty.Utils.Constants.RANDOM;

public class Student { //есть списки предметов и оценок
    private Subject[] subjects = new Subject[7];
    private int[][] marks = new int[7][10];

    private long id;
    private String name;
    private String secondName;
    private String lastName;
    private boolean payable; // true значит платит
    private int groupNumber;
    private Faculty faculty;

    public Student(String name, String secondName, String lastName, boolean payable, int groupNumber, Faculty faculty) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.payable = payable;
        this.groupNumber = groupNumber;
        this.faculty = faculty;
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

    public boolean isPayable() {
        return payable;
    }

    public void setPayable(boolean payable) {
        this.payable = payable;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public int[][] getMarks() {
        return marks;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setMarks(int[][] marks) {
        this.marks = marks;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", payable=" + payable +
                ", groupNumber=" + groupNumber +
                ", faculty=" + faculty +
                '}';
    }
}
