package by.naumenka.lesson6.task1;

public class CreditCard {
    int id;
    int balance;
    int money;

    CreditCard(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public void Salary(int money) {
        this.money = money;
        balance += money;
        System.out.println("Зачисление зарплаты: " + this.money);
        System.out.println("Текущая сумма на счете: " + this.balance);
    }

    public void BuySomething(int money) {
        this.money = money;
        balance -= money;
        System.out.println("Купил что-то: " + this.money);
        System.out.println("Текущая сумма на счете: " + this.balance);
    }

    @Override
    public String toString() {
        System.out.println();
        return "CreditCard " +
                "Номер карты: " + id +
                ", баланс: " + balance + ' ';
    }
}