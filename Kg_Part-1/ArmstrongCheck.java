import java.util.Scanner;
import java.lang.Math;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
      
        Arms(n);
        sc.close();
    }

    public static void Arms(int n)
    {
        int r=n,count=0;
        
        for(count=1; r/10>0; count++)
            r=r/10;
               System.out.println("Digits: "+ count);   //for counting digits of number
    
        int arm=0,x,y;
        x=n;
        y=n;
    
       for(int i=0; i<count; i++)
       {
           x=x%10;
           arm +=Math.pow(x,count);
           y=y/10;
           x=y;
       }
       if(n== arm)
            System.out.println(n+" is an Armstrong Number.");
       else
            System.out.println(n+" is not an Armstrong Number.");
    }

}