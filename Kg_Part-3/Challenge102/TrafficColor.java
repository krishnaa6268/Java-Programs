package in.kkcoding.Challenge102;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMills;

    TrafficColor(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }

    public int getOnTimeInMills() {
        return onTimeInMills;
    }
}
