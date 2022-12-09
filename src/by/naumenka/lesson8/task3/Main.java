package by.naumenka.lesson8.task3;

public class Main {
    public static void main(String[] args) {

        Contact kolyaContact = new Contact("Коля102", "102");
        Contact yanaContact = new Contact("103", "Яна103");
        Iphone iphone = new Iphone("XR");
        DiskoviyTelefon diskoviyTelefon = new DiskoviyTelefon(
                "АГАП-105",
                220
        );

        Samsung samsung = new Samsung(
                "A10"
        );

        Contact[] contactsToAdd = new Contact[]{kolyaContact, yanaContact};
        iphone.setContacts(contactsToAdd);
        diskoviyTelefon.call(kolyaContact);
        iphone.call("+375291045553");
        iphone.call(iphone.findContactByNameAndNumber(
                "Коля102",
                "102"
        ));

        samsung.setContacts(contactsToAdd);
        samsung.call(yanaContact);
        samsung.call("+375449333876");
        samsung.call(samsung.findContactByNameAndNumber("yana","+375332897780"));
    }
}
