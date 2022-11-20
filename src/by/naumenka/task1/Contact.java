package by.naumenka.task1;

public class Contact {
    private String nameContact;
    private String number;

    public String getNameContact() {
        return nameContact;
    }

    public String getNumber() {
        return number;
    }

    public Contact(String nameContact, String number) {
        this.nameContact = nameContact;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Контакт {" +
                " имя = '" + nameContact + '\'' +
                ", номер = '" + number + '\'' +
                '}';
    }
}