package in.kkcoding.Challenge97;

public enum Days {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeakday;

    Days(boolean isWeekday) {
        this.isWeakday= isWeekday;
    }
    public String getType(){
        return isWeakday?"Weakday": "Weekend";
    }
}
