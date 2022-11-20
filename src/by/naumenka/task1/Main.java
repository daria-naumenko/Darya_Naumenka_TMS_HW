package by.naumenka.task1;

//Создайте класс Phone, который содержит переменные number, final model и weight, массив контактов.
//создать класс Contact с полями имя контакта, номер контакта. Поля приватные.
//Создайте три экземпляра этого класса.
//Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
// переменных класса - number, model и weight.
//Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
//Добавить в класс Phone методы:
//  receiveCall, имеет один параметр – объект контакта. Выводит на консоль сообщение “Звонит {name} + {номер телефона}”.
//  getNumber – возвращает номер телефона.
//Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
// Вернуть объект типа контакт найденный в массиве контактов по имени и номеру.
//Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход контакты и сообщение, которым
// будет отправлено сообщение. Метод выводит на консоль номера этих телефонов и само сообщение.

public class Main {
    public static void main(String[] args) {

        Contact firstPhone = new Contact("Егор ", "+375291405567");
        Contact secondPhone = new Contact("Даша ", "+375293593340");
        Contact thirdPhone = new Contact("Катя ", "+375447456223");

      Phone phone = new Phone("+375442323235 ", "Samsung ", 150);

        phone.receiveCall(firstPhone);
        phone.receiveCall(secondPhone);
        phone.receiveCall(thirdPhone);

        System.out.println("\n" + phone.getNumber() + phone.getModel() + phone.getWeight());

        phone.sendMessage("\n" + "Отправить сообщение: " + "\n" + firstPhone + "\n" + secondPhone + "\n" + thirdPhone + "\n" + "Как дела?");
    }
}