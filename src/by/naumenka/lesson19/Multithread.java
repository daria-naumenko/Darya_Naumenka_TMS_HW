package by.naumenka.lesson19;

public class Multithread extends Thread {

    private int threadNumber;

    public Multithread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + " из потока " + threadNumber);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
