import java.util.Scanner;

public class CheckNumType {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();

        if(x>0)
            System.out.println(x+" is a positive number.");
        else if(x<0)
            System.out.println(x+" is a Negative number.");
        else
            System.out.println(x+" is Zero.");

        sc.close();

    }
}
