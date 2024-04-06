import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
 
        int n;

        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        Fibbo(n);
        sc.close();
    }
    public static void Fibbo(int n)
    {
        int a=0,b=1,s=0;
        if (n==1)
            System.out.print("0");
        else if(n==2)
            System.out.print("1");
        else
        {
            n=n-2;
            for(int i=1; i<=n; i++)
            {
                s=a+b;
                a=b;    
                b=s;
            }
            System.out.print(s);
        }
    }
}