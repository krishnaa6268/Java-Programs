import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        int n=0;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        System.out.println("Factorial: "+Fact(n));
        sc.close();
    }

    public static int Fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        else{
            int fact=1;
            for( ;n>=1;n--){
                fact=fact*n;
            }
            return fact;
        }
    }
}
