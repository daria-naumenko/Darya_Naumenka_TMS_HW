package by.naumenka.task1.Exception;

public class ContainsABCException extends Exception{
    private String message;
    public static final String DESCRIPTION2 = "ВАША СТРОКА СОДЕРЖИТ abc";

    public ContainsABCException(String message) {
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
