package in.kkcoding.Challenge102;

public class TestTrafficLight
{
    public static void main(String[] args) throws InterruptedException
    {
        TrafficLight red= new TrafficLight(TrafficColor.RED);
        TrafficLight yellow= new TrafficLight(TrafficColor.YELLOW);
        TrafficLight green= new TrafficLight(TrafficColor.GREEN);

        green.start();
        green.join();

        yellow.start();
        yellow.join();

        red.start();

    }
}
