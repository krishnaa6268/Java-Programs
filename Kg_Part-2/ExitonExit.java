import java.util.Scanner;

public class ExitonExit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.print("Enter a String: ");
            String input=sc.next();

            if(input.equalsIgnoreCase("Break")){
                break;
            }
            
        }
        System.out.print("Successfully exited...");

        sc.close();
    }
}
