package Timer;

public class TimerUtil {
    public int secondsBetween(int start, int end) {
        if (end < start) throw new IllegalArgumentException("End < start");
        return end - start;
    }
}
