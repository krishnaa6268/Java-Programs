import java.util.Scanner;

public class ArrDiagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter Rows only(For Square matrix): ");
        int rows=sc.nextInt();
        int col=rows;
        
        int a[][]=new int[rows][col];

        System.out.println("Enter "+(rows*col)+" Elements:");

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        PrintArr(a);
        DiagonalSum(a);

        sc.close();
        
    }
    public static void DiagonalSum(int[][] a) {
        int sum1=0, sum2=0;

        for(int i=0; i<a.length; i++)
        {
            sum1=sum1+a[i][i];             //Sum of main Diagonal....
            sum2 = sum2 + a[i][a.length-i-1];         //Sum of off Diagonal.... ///check letter
        }
        System.out.println("Sum of main Diagonal: "+(sum1));
        System.out.println("Sum of off Diagonal: "+(sum2));
    }

    public static void PrintArr(int[][] a)
    {
        System.out.println("\nElements are: ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
