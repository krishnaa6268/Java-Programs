public class StirngManupulation {
    public static void main(String[] args) {
        String fn="Krishnaa", ln="Gupta";
       // String full=fn+" "+ln;  //or....
        //System.out.println(fn.concat(" ".concat(ln)).toLowerCase());    //or....

        String full= fn.concat(" ".concat(ln));
        System.out.println(full.toUpperCase());

    }
}
