import java.util.Scanner;


public class ArrMaxMin {
    public static void main(String[] args) 
    {
        int a[]=new int[5];
        System.out.println("Enter 5 Elements:");
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
       MaxMin(a);

        sc.close();
    }

    public static void MaxMin(int[] a)
    {

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){

                if(a[i]<a[j])   // logic for sorting array in Descending order: for ascending only put condition: (a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0; i<a.length; i++){  //for printing array
            System.out.print(a[i]+",");
        }
           
        System.out.println("\n"+ a[a.length-1]+" is the Min element.");
        System.out.println(a[0]+" is the Max element.");
    }
}
