import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {

    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
        LocalDateTime result = LocalDateTime.parse(appointmentDateDescription, formatter);
        System.out.println("schedule: " + result);
        return result;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        boolean result = appointmentDate.isBefore(LocalDateTime.now());
        System.out.println("hasPassed: " + result);
        return result;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        boolean result = hour >= 12 && hour < 18;
        System.out.println("isAfternoonAppointment: " + result);
        return result;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
            "EEEE, MMMM d, yyyy, 'at' h:mm a.", 
            Locale.ENGLISH
        );
        String result = "You have an appointment on " + formatter.format(appointmentDate);
        System.out.println("getDescription: " + result);
        return result;
    }

    public LocalDate getAnniversaryDate() {
        LocalDate result = LocalDate.of(LocalDate.now().getYear(), 9, 15);
        System.out.println("getAnniversaryDate: " + result);
        return result;
    }
}