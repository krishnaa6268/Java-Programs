import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter a number:");

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Table(n);
       
        sc.close();
    }
    public static void Table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            int table=n*i;
            System.out.println(table);
        }
    }
}
