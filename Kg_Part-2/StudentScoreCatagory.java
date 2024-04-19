import java.util.Scanner;

public class StudentScoreCatagory {
    public static void main(String[] args) {
        int score;
        System.out.println("Enter student score:");
        Scanner sc=new Scanner(System.in);
        score=sc.nextInt();

        String res= (score>80)? "High": (score>=50 && score<=80)? "Moderate": "Low ";

        System.out.println("Marks: "+res);

        sc.close();
    }
}
