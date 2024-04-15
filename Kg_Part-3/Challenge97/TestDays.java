package in.kkcoding.Challenge97;

public class TestDays {
    public static void main(String[] args)
    {
        for (Days days : Days.values()) {
            System.out.printf("%s: %s \n", days, days.getType());
        }
    }
}
