package in.kkcoding;

class VarArgs {

    public static void main(String[] args)
    {
        System.out.println(concatenate("KK"));
        System.out.println(concatenate("KK", "Gupta"));
        System.out.println(concatenate("Vivek", "Kumar", "Gupta"));
    }



    public static String concatenate(String... strs)
    {
        StringBuilder sb=new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();

    }
}
