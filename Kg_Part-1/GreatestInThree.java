import java.util.Scanner;

public class GreatestInThree {
     public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter three numbers: ");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        if(x>y && x>z)
            System.out.println(x+" is greatest.");
        else if(y>z)
            System.out.println(y+" is greatest.");
        else
            System.out.println(z+" is greatest.");

        sc.close();
    }
}
