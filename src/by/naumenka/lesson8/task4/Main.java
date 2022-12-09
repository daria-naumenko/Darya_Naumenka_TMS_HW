package by.naumenka.lesson8.task4;

import by.naumenka.lesson8.task4.Faculty.Faculty;
import by.naumenka.lesson8.task4.Faculty.SportFaculty;

public class Main {
    public static void main(String[] args) {
        Univer univer = new Univer();
        Faculty faculty = new SportFaculty("Физра", "улица Физры", 3);
        univer.addStudent("Матвей","Филим","Филимович", true, 43330, faculty);
       System.out.println(univer.getStudents()); //to string вывести по циклу!


    }
}
