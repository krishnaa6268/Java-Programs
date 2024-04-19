import java.util.Scanner;

public class EvenOddTurnery {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);

        x=sc.nextInt();
        String res= x%2==0?"Even":"Odd";

        System.out.println(res+" Number.");

        sc.close();
    }
}
