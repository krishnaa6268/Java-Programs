package in.kkcoding.Challenge78;

public class Customer {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount("001", "Krishna");

        ba.depositMoney(100);
        ba.depositMoney(-40);
        ba.depositMoney(0);

        System.out.println("Current Balance: "+ba.withdrawnMoney(200));
        ba.withdrawnMoney(0);
        ba.withdrawnMoney(-4);
    }
}
