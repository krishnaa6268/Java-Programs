import java.util.Scanner;

public class BitwaseNOT {
     public static void main(String[] args)
    {
        int x;
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
    
        System.out.println("Bitwise NOT(Complement): "+(~x));

        sc.close();
    }
}
