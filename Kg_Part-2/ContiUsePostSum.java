import java.util.Scanner;

public class ContiUsePostSum {
    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println("Enter 5 Elements:");
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        } 

        int sum=0;
        for(int ele: arr){
            if(ele<0){
                continue;
            }
            sum+=ele;
        }
        System.out.println("Sum (only positive): "+sum);

        sc.close();
    }
}
