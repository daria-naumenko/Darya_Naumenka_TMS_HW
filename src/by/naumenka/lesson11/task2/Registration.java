package by.naumenka.lesson11.task2;

import by.naumenka.lesson11.task2.Exception.WrongLoginException;
import by.naumenka.lesson11.task2.Exception.WrongPasswordException;

import static by.naumenka.lesson11.task2.Exception.WrongLoginException.DESCRIPTION_LOGIN;
import static by.naumenka.lesson11.task2.Exception.WrongPasswordException.DESCRIPTION_PASSWORD;

public class Registration {

    public static boolean loginMethod(String login) throws WrongLoginException {
        try {
            if (login.length() > 20 || login.contains(" ")) {
                throw new WrongLoginException("ИСКЛЮЧЕНИЕ ");
            }
        } catch (WrongLoginException ex) {
            System.err.println(ex.getMessage() + DESCRIPTION_LOGIN);
        }
        return false;
    }

    public static boolean passwordMethod(String password, String confirmPassword) throws WrongPasswordException {
        try {
            if (password.length() > 20 || password.contains(" ") || password.matches("[^0-9]+") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("ИСКЛЮЧЕНИЕ ");
            }
        } catch (WrongPasswordException ex) {
            System.err.println(ex.getMessage() + DESCRIPTION_PASSWORD);
        }
        return true;
    }
}