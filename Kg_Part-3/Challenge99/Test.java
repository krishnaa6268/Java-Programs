package in.kkcoding.Challenge99;

public class Test {
    public static void main(String[] args) {
        HelloThread t1= new HelloThread(1);
        HelloThread t2= new HelloThread(2);

        // t1.run();  // ye main method ke under hi run ho gya hoga...

        t1.start();
        t2.start();

    }
}
