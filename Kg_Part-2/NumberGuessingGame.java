import java.util.Scanner;

public class NumberGuessingGame {

    int rand;

    NumberGuessingGame()    //cunstructor
    {
        rand=(int)Math.ceil(Math.random()*100);
        //System.out.println("Rand: "+rand);   to see the random number...
    }

    /**
     * 
     * @param guessNo the number which is taken by user and check the condition based on the number.
     * @return -ve->guessed no is smaller, 
     *          0->guessed no is eqal, 
     *         +ve->guessed no is higher.
     */
    int Guess(int guessNo){
        return guessNo - rand;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to number guessing game: Please guess the number between 1-100. \n");
        
        NumberGuessingGame gg= new NumberGuessingGame();
        int num, res;

        do{
            System.out.print("Enter a number: ");
            num= sc.nextInt();
            res=gg.Guess(num);

            if(res==0)
            System.out.println("Congras! Your guess is right...");
            else if(res>0)
            System.out.println("Guesing number is Lower than this number...");
            else if(res<0)
            System.out.println("Guesing number is Higher than this number...");

        }while(res!=0);
        
        sc.close();
    }
}