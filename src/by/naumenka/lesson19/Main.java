package by.naumenka.lesson19;

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