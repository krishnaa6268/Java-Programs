package in.kkcoding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your String:");
        String uStr=sc.next();

        for (char ch : uStr.toCharArray()) {
            unique.add(ch); // RETURN TRUE/FALSE...
        }

        System.out.printf("Your string has %d unique Characters...", unique.size());
    }
}
