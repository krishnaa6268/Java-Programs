package in.kkcoding.Challenge101;

public class ThreadPrint extends Thread{
    private final int threadNumber;

    public ThreadPrint(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s- Thread Starting,and Thread No: %d\n",
                    (Thread.currentThread().getName()),threadNumber);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s- Thread Ended,and Thread No: %d\n",
                (Thread.currentThread().getName()),threadNumber);
    }
}
