class NeedForSpeed {
    private int speed;
    private int batteryPercentage = 100;
    private int batteryDrain;
    private int distance = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain ? true : false;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (batteryPercentage == 0) return;
        distance += speed;
        batteryPercentage -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.getBatteryPercentage() / car.getBatteryDrain() * car.getSpeed() >= distance;
    }
}
