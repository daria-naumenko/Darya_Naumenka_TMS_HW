package by.naumenka.lesson19;

//1. Создать три потока Т1, Т2 и Т3
//Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1
//(используя метод join)

public class Main {
    public static void main(String[] args) {

        for (int i = 3; i >= 1; i--) {

            Multithread thread = new Multithread(i);
            thread.start();
            System.out.println();

            try {
                thread.join();
            } catch (InterruptedException e) {
            }
        }
    }
}