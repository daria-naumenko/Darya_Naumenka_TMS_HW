package by.naumenka.lesson8.task4.Faculty;

import static by.naumenka.lesson8.task4.Faculty.Utils.Constants.CHEMICALS;
import static by.naumenka.lesson8.task4.Faculty.Utils.Constants.RANDOM;

public class ChemistryFaculty extends Faculty {  // здесь только геттеры так как онм константы
    private String[] chemicals;
    private long id;

    public ChemistryFaculty(String name, String address) {
        super(name, address);
        this.chemicals = CHEMICALS;
        this.id = Math.abs(RANDOM.nextLong());
    }

    public long getId() {
        return id;
    }

    public String[] getChemicals() {
        return chemicals;
    }
}
