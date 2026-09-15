public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean result = !knightIsAwake;
        System.out.println("canFastAttack: " + result);
        return result;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean result = knightIsAwake || archerIsAwake || prisonerIsAwake;
        System.out.println("canSpy: " + result);
        return result;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean result = prisonerIsAwake && !archerIsAwake;
        System.out.println("canSignalPrisoner: " + result);
        return result;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean result;
        if (petDogIsPresent) {
            result = !archerIsAwake;
        } else {
            result = prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
        System.out.println("canFreePrisoner: " + result);
        return result;
    }
}