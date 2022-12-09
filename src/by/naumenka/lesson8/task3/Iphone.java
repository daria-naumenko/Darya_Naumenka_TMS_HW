package by.naumenka.lesson8.task3;

public class Iphone extends Phone {

    private String os;
    private Contact[] contacts = new Contact[5];

    public Iphone() {
    }

    public Iphone(String model) {
        super(model);
    }

    public Iphone(String model1, double weight1, String color1, int hdd1, int ram1, double screenDiagonal1, int batteryValue1, int length1, int width1) {
        super(model1, weight1, color1, hdd1, ram1, screenDiagonal1, batteryValue1, length1, width1);
        this.os = "IOS";
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            this.contacts[i] = contacts[i];
        }
        this.contacts = contacts;
    }

    public Contact findContactByNameAndNumber(String name1, String number1) {
        Contact contactWeAreLookingFor = null;
        for (int i = 0; i < contacts.length; i++) {
            if (
                    contacts[i].getName().equals(name1) &&
                            contacts[i].getNumber().equals(number1)
            ) {
                contactWeAreLookingFor = contacts[i];
            }
        }
        return contactWeAreLookingFor;
    }

    @Override
    public void call(Contact contact) {
        System.out.println("Звоню контакту " + contact.getName() +
                " по номеру " + contact.getNumber());
    }

    @Override
    public void call(String number) {
        System.out.println("Звоню на номер " + number);
    }


    @Override
    public void calll() {
        super.calll();
    }
}
