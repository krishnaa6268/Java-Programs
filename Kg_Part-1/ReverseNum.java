import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        System.out.print("Reverse Number:"+Reverse(n));

        sc.close();
    }
    public static int Reverse(int n)
    {
        int r=0,rev=0;

        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
}
