package by.naumenka.task3;

public interface Callable {
    void call(String number);

    void call(Contact contact);

    default void calll() {
        System.out.println("SPAM");
    }

}
