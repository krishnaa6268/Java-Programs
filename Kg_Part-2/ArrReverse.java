import java.util.Scanner;

public class ArrReverse {
     public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);

       System.out.println("Enter the "+ arr.length +" Elements for Array:");
       for(int i=0; i<arr.length; i++){
           arr[i]=sc.nextInt();
       }
       PrintArr(ReverseArr(arr));
       
       sc.close();
    }

    public static int[] ReverseArr(int[] arr)
    {
        int i=0, j=0, temp=0;
      //  int newArr[] = new int[5];    //usig new array............

        for( i=0,j=4; i<j; i++,j--) {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
       }


       return arr;
       // return newArr;    //for usig new array............
    }

    public static void PrintArr(int[] arr)
    {
        System.out.println("Elements are: ");
        for(int i=0; i<arr.length; i++) {
             System.out.print(arr[i]+", ");
        }
    }
}
