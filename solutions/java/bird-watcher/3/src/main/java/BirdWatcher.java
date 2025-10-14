import java.util.*;

class BirdWatcher {
    private static final int[] LAST_WEEK = {0, 2, 5, 3, 7, 8, 4};
    private static final int BUSY_THRESHOLD = 5;
    
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return LAST_WEEK.clone();
    }

    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(b -> b == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        return numberOfDays > 0 ? Arrays.stream(birdsPerDay, 0, Math.min(numberOfDays, birdsPerDay.length)).sum() : 0;
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(b -> b >= BUSY_THRESHOLD).count();
    }
}
