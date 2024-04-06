import java.util.Scanner;

public class ArithmeticOp {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        float a,b;
        System.out.println("\nEnter two floating pointnumbers: ");
        Scanner ref= new Scanner(System.in);
        a=ref.nextFloat();
        b=ref.nextFloat();
        System.out.println("Floating Mutiply: "+ a*b);

        sc.close();
        ref.close();
    }
}