import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args){
        int n;

        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        Prime(n);

        sc.close();
    }
    public static void Prime(int n){
        int p,s=0;
        p=(n/2);

        for(int i=2; i<=p; i++){
            if(n%i==0){
                System.out.print("Number is not prime.");
                s=1;
                break;
            }
        }
        if(s==0)
            System.out.print("Number is a prime.");
    }
}
