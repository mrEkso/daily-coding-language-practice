public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        return LogLevel.from(getCode());
    }

    public String getOutputForShortLog() {
        return getLogLevel().getEncoding() + ":" + getMessage();
    }

    private String getCode(){
        return logLine.substring(1, 4);
    }

    private String getMessage(){
        return logLine.substring(logLine.indexOf(':') + 2);
    }
}
