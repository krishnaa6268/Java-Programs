import java.util.Scanner;

public class ArrMergeTwoSorted {
     public static void main(String[] args) {
        int size=3;
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[size*2];
        int[] arr2=new int[size];

       System.out.println("Enter the "+ arr1.length/2 +" Elements for Array:");
       for(int i=0; i<arr1.length/2; i++){
           arr1[i]=sc.nextInt();
       }
       System.out.println("Enter the "+ arr2.length +" Elements for Array:");
       for(int i=0; i<arr2.length; i++){
           arr2[i]=sc.nextInt();
       }
        
        PrintArr(arr1);
        PrintArr(arr2); 
        
        MergeTwoSorted(arr1, arr2); // merge two aarays...
        PrintArr(SortArr(arr1)); // print two sorted array...

       sc.close();
    }

    public static void MergeTwoSorted(int[] arr1, int[] arr2)
    {
        for(int i=(arr1.length/2),j=0; i<arr1.length; i++,j++){
            arr1[i]=arr2[j];
        } 
    }

    public static void PrintArr(int[] arr)
    {
        System.out.println("\nElements are: ");
        for(int i=0; i<arr.length; i++) {
             System.out.print(arr[i]+", ");
        }
    }

    public static int[] SortArr(int[] a)
    {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){

                if(a[i]>a[j])  //for dscending only put condition: (a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

}
