import java.util.Scanner;

public class RightShift // use for 2's division
{
        public static void main(String[] args)
    {
        int x,y;
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("Right Shift Op: "+(x>>y));

        sc.close();
    }
}
