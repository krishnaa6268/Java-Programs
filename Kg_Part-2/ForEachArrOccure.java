import java.util.Scanner;

public class ForEachArrOccure {
    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println("Enter 5 Elements:");
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        } 
        System.out.print("Enter an element that want to search: ");
        int num=sc.nextInt();

        int count=0;
        for(int ele: arr){
            if(ele==num){
                count++;
            }
        }
        System.out.println("Occurences Times: "+count);

        sc.close();
    }
}
