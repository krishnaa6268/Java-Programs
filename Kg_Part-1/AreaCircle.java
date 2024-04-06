import java.util.*;

public class AreaCircle {

    public static void main(String[]args)
    {
      double r, a;
      System.out.println("enter radius of the circle");
    Scanner sc= new Scanner(System.in);
    r=sc.nextDouble();
    a =(3.14)*r*r;
    System.out.println("area of circle is"+a+"having the radius"+r);

        sc.close();
    }
    
}