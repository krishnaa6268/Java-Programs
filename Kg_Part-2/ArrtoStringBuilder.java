public class ArrtoStringBuilder {
    public static void main(String[] args) {

        String[] str= new String[]{"I am", "Krishna", "Kumar", "Gupta", "from", "LNCT MCA"};

        StringBuilder sb=new StringBuilder();   //create a string builder to append all the string at once.

        for (String str2 : str) {
            sb.append(str2).append(" ");
        }
        System.out.println(sb);
    }
}
