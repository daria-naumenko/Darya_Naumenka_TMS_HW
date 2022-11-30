package by.naumenka.task4.Faculty;

import static by.naumenka.task4.Faculty.Utils.Constants.RANDOM;

public class RadioPhysicsFaculty extends Faculty {
    private int electronMicroscopeCount;
    private long id;

    public RadioPhysicsFaculty(String name, String address, int electronMicroscopeCount) {
        super(name, address);
        this.electronMicroscopeCount = 3;
        this.id = Math.abs(RANDOM.nextLong());
    }

    public long getId() {
        return id;
    }

    public int getElectronMicroscopeCount() {
        return electronMicroscopeCount;
    }

    public void setElectronMicroscopeCount(int electronMicroscopeCount) {
        this.electronMicroscopeCount = electronMicroscopeCount;
    }
}
