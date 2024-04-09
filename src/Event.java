public class Event {

    private int day;
    private int month;
    private int year;
    private String event;

    public Event(int d, int m, int y, String e) {
        this.day = d;
        this.month = m;
        this.year = y;
        this.event = e;

    }

    public String toString() {
        return String.format("%02d/%02d/%d - %s", day, month, year, event);
    }
}
