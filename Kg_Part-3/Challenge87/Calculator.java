package in.kkcoding.Challenge87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        try{
            int res = x/y;
            System.out.printf("Result: %d",res);
        }
        catch (ArithmeticException excep){
            if(excep.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero Exception...");
            }
            else{
                throw excep;
            }
        }
    }
}
