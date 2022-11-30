package by.naumenka.task4;

import static by.naumenka.task4.Faculty.Utils.Constants.RANDOM;

public class Subject {
    private long id;
    private String name;

    public Subject(String name) {
        this.name = name;
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
}
