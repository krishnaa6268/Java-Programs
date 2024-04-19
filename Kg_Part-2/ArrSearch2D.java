import java.util.Scanner;

public class ArrSearch2D 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter Rows and Columns: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        int a[][]=new int[r][c];

        System.out.println("Enter "+ a.length*2+" Elements:");

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nEnter element to find...");
        int num=sc.nextInt();

        PrintArr(a);
        Search2D(a,num);

        sc.close();
    }

    public static void Search2D(int[][] a, int num) {
        int i=0, j=0, flag=0;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a.length; j++)
            {
                if(a[i][j]== num){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
            System.out.println("Position: ["+i+"] ["+j+"]");
        else
            System.out.println("Element not in array...");
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
