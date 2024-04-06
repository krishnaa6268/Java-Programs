import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println(x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+" "+y);
        sc.close();
    }
}
