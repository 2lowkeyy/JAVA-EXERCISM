public class LogLevels {

    public static String message(String logLine) {
        String[] parts = logLine.split(":", 2);
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split(":", 2);
        String level = parts[0].replace("[", "").replace("]", "");
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}