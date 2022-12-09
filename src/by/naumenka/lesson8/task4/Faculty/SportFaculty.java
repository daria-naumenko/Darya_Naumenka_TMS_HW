package by.naumenka.lesson8.task4.Faculty;

import static by.naumenka.lesson8.task4.Faculty.Utils.Constants.RANDOM;

public class SportFaculty extends Faculty{
    private int footballFieldsCount;
    private long id;

    public SportFaculty(String name, String address, int footballFieldsCount) {
        super(name, address);
        this.footballFieldsCount = 5;
        this.id = Math.abs(RANDOM.nextLong());
    }

    public long getId() {
        return id;
    }

    public int getFootballFieldsCount() {
        return footballFieldsCount;
    }

    public void setFootballFieldsCount(int footballFieldsCount) {
        this.footballFieldsCount = footballFieldsCount;
    }
}

