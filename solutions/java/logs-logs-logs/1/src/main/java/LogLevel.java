import java.util.Arrays;

public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("UNK", 0);

    private final String parsedLogLevel;
    private final int logLevelNumber;

    LogLevel(String parsedLogLevel, int logLevelNumber){
        this.parsedLogLevel = parsedLogLevel;
        this.logLevelNumber = logLevelNumber;
    }

    public static LogLevel from(String code) {
        return Arrays.stream(values())
            .filter(l -> l.parsedLogLevel.equalsIgnoreCase(code))
            .findFirst().orElse(UNKNOWN);
    }

    public int getLogLevelNumber(){
        return logLevelNumber;
    }
}
