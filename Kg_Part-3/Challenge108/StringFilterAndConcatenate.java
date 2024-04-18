package in.kkcoding.Challenge108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs= List.of("Krishna gupta",
                " is Engineering"," Student"," in RGPV,",
                " and nothing is bad in this.");

        String res= strs.stream()
                .filter(str -> str.length()>10)
                .reduce("", (a,b)-> a+" "+b);
        System.out.println(res);
    }
}
