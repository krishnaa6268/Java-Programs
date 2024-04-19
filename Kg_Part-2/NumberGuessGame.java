import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        int num=5, x;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("welcome to number guessing game....");
        do{

            System.out.println("Please guess the number between 0 to 10");
            x=sc.nextInt();

        }while(!NumberGuessing(num, x));
        System.out.println("Number Guessed...");
        sc.close();
    }

    public static boolean NumberGuessing(int num, int x){
        return (num==x);
    }
}
