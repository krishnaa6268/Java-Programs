import java.util.Scanner;

public class AgeGroupDefine {
    public static void main(String[] args) {
        float age;
        System.out.println("Enter age: ");
        Scanner sc= new Scanner(System.in);
        age=sc.nextFloat();

        if(age<=13  && age>=0)
            System.out.println("Child.");
        else if(age<=20 && age>13)
            System.out.println("Teen.");
        else if(age<=60 && age>20)
            System.out.println("Adult.");
        else if(age>60)
            System.out.println("Senior.");

            sc.close();
    }
}
