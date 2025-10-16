public class JedliksToyCar {
    private int totalDistance = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters";
    }

    public String batteryDisplay() {
        return batteryPercentage == 0 ? "Battery empty" : "Battery at " + batteryPercentage + "%";
    }

    public void drive() {
        if (batteryPercentage == 0) return;
        totalDistance += 20;
        batteryPercentage -= 1;
    }
}
