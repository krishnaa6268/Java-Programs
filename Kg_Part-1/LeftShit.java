import java.util.Scanner;

public class LeftShit // use for 2's power
{
    
    public static void main(String[] args)
    {
        int x,y;
        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("Left Shift Op: "+(x<<y));

        sc.close();
    }
}
