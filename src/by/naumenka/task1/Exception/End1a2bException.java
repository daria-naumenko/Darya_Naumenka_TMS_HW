package by.naumenka.task1.Exception;

public class End1a2bException extends Exception{
    private String message;
    public static final String DESCRIPTION3 = "ВАША СТРОКА ЗАКАНЧИВАЕТСЯ НА 1a2b";

    public End1a2bException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
