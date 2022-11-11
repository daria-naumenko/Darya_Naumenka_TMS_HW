package by.naumenka.task1;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму. Добавьте метод, который выводит текущую информацию о карточке.
//(переопределить toString(), пример:
//Номер счёта : <сумма>
//Количество денег на счету : <цифра>
//Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.

public class Main {
    public static void main(String[] args) {

        CreditCard first = new CreditCard(1, 300);
        CreditCard second = new CreditCard(2, 560);
        CreditCard third = new CreditCard(3, 3500);

        System.out.println(first);
        first.Salary(200);

        System.out.println(second);
        second.Salary(1000);

        System.out.println(third);
        third.BuySomething(140);
    }
}