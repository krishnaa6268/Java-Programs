import java.util.Scanner;

public class TriangleArea {

        public static void main(String[] args)
    {
        float b,h;

        System.out.println("Enter Breadth and Height of Triangle respectively: ");
        Scanner sc= new Scanner(System.in);
        b=sc.nextFloat();
        h=sc.nextFloat();

        System.out.println("\nTriangle Area: "+ (0.5*(b*h)));
        sc.close();
    }
        
}