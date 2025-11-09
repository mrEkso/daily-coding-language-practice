import java.time.*;
import java.time.format.*;
import java.util.Locale;

class AppointmentScheduler {
    private static final DateTimeFormatter PARSE_FMT =
            DateTimeFormatter.ofPattern("MM/dd/uuuu HH:mm:ss");
    private static final DateTimeFormatter DESC_FMT =
            DateTimeFormatter.ofPattern("EEEE, MMMM d, uuuu, 'at' h:mm a", Locale.ENGLISH);

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, PARSE_FMT);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int h = appointmentDate.getHour();
        return h >= 12 && h < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return "You have an appointment on " + appointmentDate.format(DESC_FMT) + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.now().withMonth(9).withDayOfMonth(15);
    }
}
