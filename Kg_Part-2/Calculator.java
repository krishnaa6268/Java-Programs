import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
        int x,y,choice;
        System.out.println("Enter two numbers:");
        

        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Enter choice:\n1.Add, 2.Sub, 3.Multiply, 4.Division\n");
        choice=sc.nextInt();

        System.out.println("Result: "+Calc(x,y,choice));     

        sc.close();
    }

    public static int Calc(int a, int b, int ch)
    {
       return switch (ch) {
            case 1 -> a+b;
            case 2 -> a-b;
            case 3 -> a*b;
            case 4 -> a/b;
            default-> -1;
        };
    }
}
