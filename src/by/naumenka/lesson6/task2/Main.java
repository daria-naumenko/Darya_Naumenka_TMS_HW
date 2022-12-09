package by.naumenka.lesson6.task2;

//2. Создать класс, описывающий банкомат.
//Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
//количеством купюр номиналом 20, 50 и 100.
//Сделать метод для добавления денег в банкомат.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank firstBank = new Bank(6, 1, 2);

        System.out.print("Введите сумму ввода денег в банкомат: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        firstBank.AddCash(number);
    }
}