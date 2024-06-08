package exercises.charlie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class CurrentDateAndTime {

    // Program to get the current date and time and format output
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateAndTime = LocalDateTime.now();

        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");

        System.out.printf("Current time = %s%n", time.format(dtfTime));
        System.out.printf("Current date = %s%n", date.format(dtfDate));
        System.out.printf("Current date and time = %s%n", dateAndTime.format(dtf));
    }
}
