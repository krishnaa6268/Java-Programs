import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        int m;
        System.out.println("Enter year number:");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        System.out.println("Month: "+MonthMapping(m));     

        sc.close();
    }

    public static String MonthMapping(int mn)
    {
       return switch (mn) {
            case 1 -> "January";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sept";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default-> "Invalid month";
        };
    }
}
