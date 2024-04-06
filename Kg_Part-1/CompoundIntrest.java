import java.util.Scanner;

public class CompoundIntrest {
    
        public static void main(String[] args)
    {
        int p,t,r;

        System.out.println("Enter Principal, Time, Rate respectively: ");
        Scanner sc= new Scanner(System.in);
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();

        System.out.println("\nSimple Intrest: "+ (p*(1+(r/100))*t));

        sc.close();
    }
        
}
