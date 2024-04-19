import java.util.Scanner;

public class ArrRepeationCount {
    public static void main(String[] args) 
    {
        
        int arr[]=new int[5];
        System.out.println("Enter 5 Elements:");
        Scanner sc=new Scanner(System.in);
    
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the number that you want to search: ");
        int num=sc.nextInt();
        
        RepeationCount(arr, num);
        sc.close();
    }

    public static void RepeationCount(int[] arr, int num)
    {
        int count=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num)
                count++;
        }
        System.out.println("Repetetion: "+count +" Times.");
    }
}
