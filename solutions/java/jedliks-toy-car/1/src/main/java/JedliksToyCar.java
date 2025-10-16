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
        if (batteryPercentage > 0) return "Battery at " + batteryPercentage + "%";
        return "Battery empty";
    }

    public void drive() {
        if (batteryPercentage > 0) {
            totalDistance += 20;
            batteryPercentage -= 1;
        }
    }
}
