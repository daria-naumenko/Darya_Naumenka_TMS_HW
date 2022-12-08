package by.naumenka.task2.Exception;

public class WrongPasswordException extends Exception{
    private String message;
    public static final String DESCRIPTION_PASSWORD = "Длина password должна быть меньше 20 символов, " +
            "не должен содержать пробелом и должен содержать хотя бы одну цифру";

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
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