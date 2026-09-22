public class JedliksToyCar {
    private int distanceDriven = 0;
    private int batteryPercentage = 100;

    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        System.out.println("buy: nueva unidad comprada");
        return car;
    }

    public String distanceDisplay() {
        String result = "Driven " + distanceDriven + " meters";
        System.out.println("distanceDisplay: " + result);
        return result;
    }

    public String batteryDisplay() {
        String result;
        if (batteryPercentage == 0) {
            result = "Battery empty";
        } else {
            result = "Battery at " + batteryPercentage + "%";
        }
        System.out.println("batteryDisplay: " + result);
        return result;
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
            System.out.println("avanzando a " + distanceDriven + "m | Bateria: " + batteryPercentage + "%");
        } else {
            System.out.println("sin bateria");
        }
    }
}