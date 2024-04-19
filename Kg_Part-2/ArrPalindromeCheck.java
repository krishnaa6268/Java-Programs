import java.util.Scanner;

public class ArrPalindromeCheck
{
    public static void main(String[] args) {
        int size=5;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[size];
        int[] newArr=new int[size];

       System.out.println("Enter the "+ arr.length +" Elements for Array:");
       for(int i=0; i<arr.length; i++){
           arr[i]=sc.nextInt();
       }
   
       newArr=reverse(arr, arr.length);
       PalindromeCheck(arr, newArr);   //main function for logic....

       sc.close();
    }

    public static void PalindromeCheck(int[] arr, int[] newArr)   ////main function....
    {
        boolean flag=true;
        for(int i=0; i<5; i++)
        {
            if(arr[i]==newArr[i]){
                flag=true;
            }
            else{
                flag=false;
            }       
        }
        if (flag==true)
            System.out.println("Array is Palindrome.");
        else if(flag==false)
            System.out.println("Array is not Palindrome.");
    }

    public static int[] reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        return b;
    } 

    public static void PrintArr(int[] arr)
    {
        System.out.println("\nElements are: ");
        for(int i=0; i<arr.length; i++) {
             System.out.print(arr[i]+", ");
        }
    }
}
