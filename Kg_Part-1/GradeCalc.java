import java.util.Scanner;

public class GradeCalc {
     public static void main(String[] args) {
        float per;
        System.out.println("Enter Marks: ");
        Scanner sc= new Scanner(System.in);
        per=sc.nextFloat();

        if(per>=90  && per<=100)
            System.out.println("Grade: A");
        else if(per>=75 && per<90)
            System.out.println("Grade: B");
        else if(per>=60 && per<75)
            System.out.println("Grade: c");
        else if(per>=30 && per<60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");


        sc.close();
    }
}