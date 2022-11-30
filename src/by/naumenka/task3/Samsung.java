package by.naumenka.task3;

public class Samsung extends Phone {

    private String Os;
    private Contact[] contacts = new Contact[5];

    public Contact[] getContacts() {
        return contacts;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setContacts(Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            this.contacts[i] = contacts[i];
        }
        this.contacts = contacts;
    }

    private String os = "Android";

    public Samsung(String model) {
        super(model);
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
    public void call(String number) {
        System.out.println("Звоню на номер " + number);
    }


    @Override
    public void call(Contact contact) {
        System.out.println("Звоню контакту " + contact.getName() +
                " по номеру " + contact.getNumber());
    }

    @Override
    public void calll() {
        super.calll();
    }

}