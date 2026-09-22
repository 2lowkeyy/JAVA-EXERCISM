public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = getSuccessRate(speed);
        return speed * 221 * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }

    private double getSuccessRate(int speed) {
        if (speed >= 9 && speed <= 10) {
            return speed == 9 ? 0.8 : 0.77;
        } else if (speed >= 5) {
            return 0.9;
        } else {
            return 1.0;
        }
    }
}