package in.kkcoding.Challenge82;

public class ArrayOperations {

    private int[] numbers;

    ArrayOperations(int[] arr){
        this.numbers=arr;

    }

    public class Statistics {
        double mean()
        {
            double sum= 0;
            for(int number: numbers)
            {
                sum+=number;
            }
            return (sum/ numbers.length);
        }

        double median() //for median sort an array and return middle element...
        {
            return 0;
        }
    }
}
