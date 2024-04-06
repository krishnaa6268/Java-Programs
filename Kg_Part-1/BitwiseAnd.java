import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args)
    {
        int x,y;
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("Bitwise And: "+(x&y));



        sc.close();
    }
}
