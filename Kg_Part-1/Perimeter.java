import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args)
    {
        int a,b,c,d;

        System.out.println("Enter four sides of Rectangle: ");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();


        System.out.println("\nPerimeter: "+ (a+b+c+d));
        sc.close();
    }
        
}
