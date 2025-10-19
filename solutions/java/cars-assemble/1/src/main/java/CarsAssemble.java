public class CarsAssemble {
    public static int MAXIMUM_SPEED = 10;
    public static int PDOCUCED_CARS_AT_LOWEST_SPEED = 221;
    
    public double productionRatePerHour(int speed) {
        return speed * PDOCUCED_CARS_AT_LOWEST_SPEED * getSuccessRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }

    private double getSuccessRate(int speed) {
        return speed <= 0 ? 0 :
               speed <= 4 ? 1 :
               speed <= 8 ? 0.9 :
               speed == 9 ? 0.8 :
               speed == 10 ? 0.77 : 0;
    }
}
