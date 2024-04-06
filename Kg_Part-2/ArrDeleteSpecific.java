import java.util.Scanner;

public class ArrDeleteSpecific {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);

       //  arr = ScanArray(arr);   //input Array... Bad me dekhunga...
       System.out.println("Enter the "+ arr.length +" Elements for Array:");
       for(int i=0; i<arr.length; i++) {
           arr[i]=sc.nextInt();
       } 

        System.out.println("Enter the specific element you want to delete:");
        int num=sc.nextInt();

        arr=DeleteSpecific(arr, num); 
        PrintArr(arr);
        sc.close();
    }
    
    public static int[] DeleteSpecific(int[] arr, int num)
    {
        int newSize= arr.length-Occur(arr, num);
        int[] newArr=new int[newSize];
        int ocr=Occur(arr, num);

        if (ocr == 0){
            return arr;
        }
        else
        {
            for(int i=0, j=0; i<arr.length; i++) {
                if(arr[i] != num) 
                {
                    newArr[j]=arr[i];
                    j++;
                }
            }
            return newArr;
        }
        
    }

    public static int Occur(int[] arr,int num)
    {
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==num)
                count++;
        }
        return count;
    }

    public static void PrintArr(int[] arr)
    {
        System.out.println("Elements are: ");
        for(int i=0; i<arr.length; i++) {
             System.out.println(arr[i]);
        }

    }

    public static int[] ScanArray(int[] arr)        // try to fix this....
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the "+ arr.length +" Elements for Array:");
        for(int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
}