import java.util.Scanner;

public class CheckOddEven {
     public static void main(String[] args) {
        int x;
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();

        if(x%2==0)
            System.out.println(x+" is an Even.");
        else
            System.out.println(x+" is an odd.");

        sc.close();
    }
}
