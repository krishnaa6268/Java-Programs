import java.util.Scanner;

public class FindAbsoluteNumTernury {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);

        x=sc.nextInt();
        int res= x>=0?x:(-x);

        System.out.println(res+" Absolute Number.");

        sc.close();
    }
}
