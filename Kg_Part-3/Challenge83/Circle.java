package in.kkcoding.Challenge83;

public class Circle extends Shape{

    private final double radiusInCms;

    public Circle(double rad)
    {
        this.radiusInCms=rad;
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radiusInCms,2));
    }
}
