package in.kkcoding.Challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args)
    {
        int number=5;
        System.out.println("Factorial using General Method: "+ factorial(4));

        System.out.println("Factorial using functional programming...");
        IntStream.rangeClosed(2, number)
                .reduce((a,b)-> a*b)
                .ifPresent(System.out::println);

    }

    public static int factorial(int num)
    {
        int fact=1;
        if(num==0 || num==1){
            return 1;
        }
        for (int i=2; i <= num; i++) {
            fact*=i;
        }
        return fact;
    }
}
