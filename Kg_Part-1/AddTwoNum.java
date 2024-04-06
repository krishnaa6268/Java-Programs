import java.util.*;

public class AddTwoNum {
  
    public static void main(String[] args)
    {
        int a,b;
        System.out.print("Enter Two Numbers: ");
        Scanner obj=new Scanner(System.in);

        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Addition: "+(a+b));

        obj.close();  // close obj for resourse leak..

    }
}
