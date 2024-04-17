package in.kkcoding.Challenge100;

public class TestStateThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1= new ThreadState();

        System.out.printf("Create the thread: %s\n", t1.getState());

        t1.start();
        t1.join();
        System.out.printf("\nThread finished: %s", t1.getState());
    }
}
