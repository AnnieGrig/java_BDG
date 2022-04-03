package methodEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Ex15 {
    public static void main(String[] args) {
        printCurrentDateAndTime();
    }

    public static void printCurrentDateAndTime() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");
        System.out.println(date.format(formatter));
    }
}
