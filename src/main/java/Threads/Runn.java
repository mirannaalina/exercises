package Threads;

public class Runn implements Runnable {

    private Thread t;
    private String threadname;

    public Runn(String threadname) {
        this.threadname = threadname;
        System.out.println("Creating "+threadname);
    }

    @Override
    public void run() {

        System.out.println("Running" + threadname);

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread" + threadname + "," + i);

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {

            System.out.println("Thread "+threadname+"interrupted");
        }
        System.out.println("Thread"+ threadname+"existing");

    }

    public void start() {
        System.out.println("Starting " + threadname);

        if (t == null) {
               t=new Thread(this, threadname);
        }
    }
}
