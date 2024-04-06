import java.util.Scanner;

public class CheckEvenUsingBitwise {
        public static void main(String[] args)
    {
        int x;
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        if((x&1)==0)
            System.out.println("Even.");
        else
        System.out.println("Odd.");

        sc.close();
    }
}
