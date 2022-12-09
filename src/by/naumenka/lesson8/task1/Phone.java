package by.naumenka.lesson8.task1;

public class Phone {
    private String number;
    final String model;
    private int weight;

    Contact[] contact = new Contact[3];

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    Contact contactWeAreLooking = null;

    public void receiveCall(Contact contact) {
        System.out.println("Вам звонит " + contact.getNameContact() + contact.getNumber());
    }

    public Contact receiveCall(String getNameContact, String getNumber) {
        for (int i = 0; i < contact.length; i++) {
            if (contact[i].getNameContact().equals(getNameContact) &&
                    contact[i].getNumber().equals(getNumber)) {
                contactWeAreLooking = contact[i];
            }
        }
        return contactWeAreLooking;
    }

    public void sendMessage(String... contact) {
        for (int i = 0; i < contact.length; i++) {
            System.out.println(contact[i] + " "); //аргументы переменной длины
        }
    }
}