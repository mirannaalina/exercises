package Threads;

public class Main {

    public static void main(String[] args) {
        Runn r1 = new Runn("Thread1");
        r1.start();
        r1.run();

        Runn r2 = new Runn("Thread2");
        r2.start();
        r2.run();
    }
}
