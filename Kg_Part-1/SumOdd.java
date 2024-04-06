import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        Odd(n);

        sc.close();
    }

    public static void Odd(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i+=2){ 
            sum=sum+i;
        }
        System.out.println("SUM ODD: "+sum);
    }

}
