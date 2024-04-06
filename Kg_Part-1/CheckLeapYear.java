import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        int y;
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        y=sc.nextInt();

        if(y%4==0 && ((y%400==0) && (y%100==0)))
            System.out.println(y+" is a Leap Year.");
        else
        System.out.println(y+" is not a Leap Year.");

        sc.close();
    }
}