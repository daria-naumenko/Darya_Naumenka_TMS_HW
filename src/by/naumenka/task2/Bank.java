package by.naumenka.task2;

public class Bank {
    int cash20;
    int cash50;
    int cash100;
    int balance;

    Bank(int cash20, int cash50, int cash100) {
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
        balance = this.cash20 * 20 + this.cash50 * 50 + this.cash100 * 100;
        System.out.println("В банкомате " + balance + " руб \n" + cash20 + " шт. 20 рублевых купюр\n" + cash50 + " шт. 50 рублевых купюр\n" + cash100 + " шт. 100 рублевых купюр\n");
    }

    public void AddCash(int number) {
        System.out.println("Вы  положили в банкомат " + number + " руб");
        balance = balance + number;
        System.out.println("На вашем счете " + balance + " руб");
    }

}