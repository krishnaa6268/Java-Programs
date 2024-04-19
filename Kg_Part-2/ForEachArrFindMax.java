import java.util.Scanner;

public class ForEachArrFindMax {
    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println("Enter 5 Elements:");
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        } 

        int max= Integer.MIN_VALUE;
        for(int num: arr){
            if(max<num){
                max=num;
            }
        }
        System.out.println("Maximum number: "+max);

        sc.close();
    }
}