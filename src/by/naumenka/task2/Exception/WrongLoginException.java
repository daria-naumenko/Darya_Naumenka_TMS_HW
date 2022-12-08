package by.naumenka.task2.Exception;

public class WrongLoginException extends Exception{
    private String message;
    public static final String DESCRIPTION_LOGIN = "Длина login должна быть меньше 20 символов " +
            "и не должен содержать пробелы";

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
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