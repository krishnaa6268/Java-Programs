package in.kkcoding.Challenge102;

public class TrafficLight extends Thread{

   private final TrafficColor color;


    public TrafficLight(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run()
    {
        System.out.printf("%s: Color Active\n", color);
        try {
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s: Color Inactive\n", color);
    }
}
