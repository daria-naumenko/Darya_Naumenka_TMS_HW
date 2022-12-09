package by.naumenka.lesson8.task4.Faculty;

import by.naumenka.lesson8.task4.Mentor;
import by.naumenka.lesson8.task4.Subject;

public abstract class Faculty { //будут списки предметов и списки преподов
    Mentor[] mentors = new Mentor[10];
    Subject[] subjects = new Subject[4];

    private long id;
    String name;
    String address;

    public Faculty(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
