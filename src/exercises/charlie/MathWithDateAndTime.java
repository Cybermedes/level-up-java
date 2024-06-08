package exercises.charlie;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MathWithDateAndTime {

    // Program to make basic addition and subtraction with dates and times
    public static void main(String[] args) {
        LocalDateTime timeOne = LocalDateTime.of(2024, 2, 14, 17, 35);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");

        LocalDateTime beforeTimeOne = timeOne.minusHours(46);
        LocalDateTime afterTimeOne = timeOne.plusDays(5).plusHours(9);

        System.out.printf("timeOne = %s%n", timeOne.format(dtf));
        System.out.printf("timeOne - 46 hours = %s%n", beforeTimeOne.format(dtf));
        System.out.printf("timeOne + 5 days + 9 hours = %s%n", afterTimeOne.format(dtf));

        System.out.printf("is beforeTimeOne before timeOne? %b%n", beforeTimeOne.isBefore(timeOne));
        System.out.printf("is afterTimeOne after timeOne? %b%n", afterTimeOne.isAfter(timeOne));

    }
}
