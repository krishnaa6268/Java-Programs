import java.util.Scanner;

public class RecrsPalindrome {
    public static void main(String[] args) {
        System.out.print("Enter String:");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        System.out.println("Your String is: "
                        +(isPalin(s)? "Palindrome"
                                    : "Not Palindrome"));
    
        sc.close();
    }  

    public static boolean isPalin(String s)
    {
        if(s.length()<=1)
            return true;

        int lastPos=s.length()-1;
        if(s.charAt(0)!=s.charAt(lastPos)){
            return false;
        }
        String newStr= s.substring(1, lastPos);
        return isPalin(newStr);
    }
}
