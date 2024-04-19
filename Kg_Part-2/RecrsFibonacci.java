import java.util.Scanner;

public class RecrsFibonacci {
  public static void main(String[] args) {
    System.out.print("Enter the number of elements to be print:");
    Scanner sc=new Scanner(System.in);
    int count=sc.nextInt();
    
    for(int i=1; i<=count; i++)
    {
       System.out.print(Fibonacci(i)+",");
    }

    sc.close();
  }  
  public static int Fibonacci(int pos)
  {
    if(pos==1)
        return 0;
    if(pos==2)
        return 1;
    return Fibonacci(pos-1)+Fibonacci(pos-2);
  }
}
