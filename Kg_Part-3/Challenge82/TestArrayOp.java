package in.kkcoding.Challenge82;

public class TestArrayOp
{
    public static void main(String[] args)
    {
        ArrayOperations arr=new ArrayOperations(new int[]{10, 20, 30, 40});
        ArrayOperations.Statistics statis = arr.new Statistics();

        System.out.println("Mean:"+statis.mean());
        System.out.println("Median(not implemented):"+statis.median());
    }
}
