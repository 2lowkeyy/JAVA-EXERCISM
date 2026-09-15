public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = getSuccessRate(speed);
        double rate = speed * 221 * successRate;
        System.out.println("productionRatePerHour: " + rate);
        return rate;
    }

    public int workingItemsPerMinute(int speed) {
        int items = (int) (productionRatePerHour(speed) / 60);
        System.out.println("workingItemsPerMinute: " + items);
        return items;
    }

    private double getSuccessRate(int speed) {
        double rate;
        if (speed >= 9 && speed <= 10) {
            rate = speed == 9 ? 0.8 : 0.77;
        } else if (speed >= 5) {
            rate = 0.9;
        } else {
            rate = 1.0;
        }
        System.out.println("getSuccessRate: " + rate);
        return rate;
    }
}