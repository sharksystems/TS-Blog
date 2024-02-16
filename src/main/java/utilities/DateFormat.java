package utilities;

import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

public class DateFormat {
    public static final DateTimeFormatter
            MMMM_YYYY = ofPattern("MMMM uuuu"),
            MMMM_D_YYYY = ofPattern("MMMM d, uuuu"),
            DAY = ofPattern("d");
}
