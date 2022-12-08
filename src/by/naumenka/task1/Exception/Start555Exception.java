package by.naumenka.task1.Exception;

public class Start555Exception extends Exception {
    private String message;
    public static final String DESCRIPTION = "ВАША СТРОКА НАЧИНАЕТСЯ С 555";

    public Start555Exception(String message) {
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