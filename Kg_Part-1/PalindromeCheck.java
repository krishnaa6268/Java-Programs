import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) 
    {
        int n;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        Palindrome(n);

        sc.close();
    }
    public static void Palindrome(int n)
    {
        int r=0,rev=0, num=n;

        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==num)
            System.out.println(num+" is Palindrome.");
        else
            System.out.println(num+" is not Palindrome.");
    }
}