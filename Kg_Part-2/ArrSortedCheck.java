import java.util.Scanner;

public class ArrSortedCheck {
    public static void main(String[] args) 
    {
        int a[]=new int[5];
        System.out.println("Enter 5 Elements:");
        Scanner sc=new Scanner(System.in);
    
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        ArrMaxMin.MaxMin(a); //just check for use of other class methods...

        boolean b=SortedCheck(a);
        if(b==true)
            System.err.println("Sorted.");
        if (b== false) 
            System.err.println("Not Sorted.");

        sc.close();
    }

    public static boolean SortedCheck(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return false;
        }
        return true;
    }
}
