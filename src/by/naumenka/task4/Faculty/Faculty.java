package by.naumenka.task4.Faculty;

import by.naumenka.task4.Mentor;
import by.naumenka.task4.Subject;

import java.util.Random;

import static by.naumenka.task4.Faculty.Utils.Constants.RANDOM;

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
