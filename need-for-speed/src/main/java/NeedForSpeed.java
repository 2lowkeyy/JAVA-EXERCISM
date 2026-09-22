class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int battery = 100;
    private int distanceDriven = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        System.out.println("NeedForSpeed: creado | speed=" + speed + ", drain=" + batteryDrain);
    }

    public boolean batteryDrained() {
        boolean drained = battery < batteryDrain;
        System.out.println("batteryDrained: " + drained);
        return drained;
    }

    public int distanceDriven() {
        System.out.println("distanceDriven: " + distanceDriven);
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            battery -= batteryDrain;
            System.out.println("drive: recorrido=" + distanceDriven + "m | bateria=" + battery + "%");
        } else {
            System.out.println("drive: sin bateria");
        }
    }

    public static NeedForSpeed nitro() {
        System.out.println("nitro: auto Nitro creado");
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() { return speed; }
    public int getBatteryDrain() { return batteryDrain; }
}

class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
        System.out.println("RaceTrack: distancia=" + distance);
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int drivesNeeded = (distance + car.getSpeed() - 1) / car.getSpeed();
        boolean canFinish = (drivesNeeded * car.getBatteryDrain()) <= 100;

        System.out.println("canFinishRace: " + canFinish);
        return canFinish;
    }
}