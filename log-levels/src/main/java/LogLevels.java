public class LogLevels {

    public static String message(String logLine) {
        String[] parts = logLine.split(":", 2);
        String result = parts[1].trim();
        System.out.println("message: " + result);
        return result;
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split(":", 2);
        String level = parts[0].replace("[", "").replace("]", "");
        String result = level.toLowerCase();
        System.out.println("logLevel: " + result);
        return result;
    }

    public static String reformat(String logLine) {
        String result = message(logLine) + " (" + logLevel(logLine) + ")";
        System.out.println("reformat: " + result);
        return result;
    }
}