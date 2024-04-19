import java.util.Scanner;

public class ArrSumAvg2D 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter Rows and Columns: ");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        
        int a[][]=new int[rows][col];

        System.out.println("Enter "+(rows+col)+" Elements:");

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        PrintArr(a);
        int sv=rows+col;
        SumAvg(a,sv);

        sc.close();
    }

    public static void SumAvg(int[][] a, int sv)
    {
        int sum=0;

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                sum=sum+a[i][j];
            }
        }

        System.out.println("Sum:"+ sum);
        System.out.println("Average: "+(sum/sv));

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
