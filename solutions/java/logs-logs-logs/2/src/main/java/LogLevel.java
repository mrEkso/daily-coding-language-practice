import java.util.Arrays;

public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("UNK", 0);

    private final String shortCode;
    private final int encoding;

    LogLevel(String shortCode, int encoding){
        this.shortCode = shortCode;
        this.encoding = encoding;
    }

    public static LogLevel from(String code) {
        return Arrays.stream(values())
            .filter(l -> l.shortCode.equalsIgnoreCase(code))
            .findFirst().orElse(UNKNOWN);
    }

    public int getEncoding(){
        return encoding;
    }
}
