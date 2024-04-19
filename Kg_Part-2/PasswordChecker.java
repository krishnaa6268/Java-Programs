import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        
        String tryy;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("Enter a Password:");
            tryy=sc.nextLine();
        }
        while(!PassCheck(tryy));
        System.out.println("Password is matched...");

        sc.close();
    }

    public static boolean PassCheck(String tryy)
    {
        return tryy.length()>6;
    }
    
}