import java.util.Scanner;

public class FarehtToCelsConvert {
        public static void main(String[] args)
    {
        float f,c;

        System.out.println("Enter Fahrenite Temprature: ");
        Scanner sc= new Scanner(System.in);
        f=sc.nextFloat();

        c=(f-32)*5/9;

        System.out.println("\nSimple Intrest: "+(c));

        sc.close();
    }
      
}
