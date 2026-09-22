import java.util.Random;

class CaptainsLog {
    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int index = random.nextInt(PLANET_CLASSES.length);
        char result = PLANET_CLASSES[index];
        System.out.println("randomPlanetClass: " + result);
        return result;
    }

    String randomShipRegistryNumber() {
        int number = 1000 + random.nextInt(9000);
        String result = "NCC-" + number;
        System.out.println("randomShipRegistryNumber: " + result);
        return result;
    }

    double randomStardate() {
        double result = 41000.0 + 1000.0 * random.nextDouble();
        System.out.println("randomStardate: " + result);
        return result;
    }
}