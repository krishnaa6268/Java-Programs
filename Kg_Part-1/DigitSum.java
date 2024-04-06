import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args)
    {
        int n=0;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        System.out.println("Sum of Digit:"+  DigitS(n));

        sc.close();
    }

    public static int DigitS(int n)
    {
        int sum=0;
       while (n>0)
       {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
}
