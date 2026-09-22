public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String levelStr = logLine.substring(1, 4);
        LogLevel level;

        switch (levelStr) {
            case "TRC":
                level = LogLevel.TRACE;
                break;
            case "DBG":
                level = LogLevel.DEBUG;
                break;
            case "INF":
                level = LogLevel.INFO;
                break;
            case "WRN":
                level = LogLevel.WARNING;
                break;
            case "ERR":
                level = LogLevel.ERROR;
                break;
            case "FTL":
                level = LogLevel.FATAL;
                break;
            default:
                level = LogLevel.UNKNOWN;
                break;
        }

        System.out.println("getLogLevel: [" + levelStr + "] -> " + level);
        return level;
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        String message = logLine.substring(logLine.indexOf("]: ") + 3);
        String result = level.getEncodedLevel() + ":" + message;

        System.out.println("getOutputForShortLog: " + result);
        return result;
    }
}