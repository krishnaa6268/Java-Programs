package in.kkcoding.Challenge101;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        ThreadPrint t1= new ThreadPrint(1);
        ThreadPrint t2= new ThreadPrint(2);
        ThreadPrint t3= new ThreadPrint(3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}
