package utilities;

import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

public class DateFormat {
    public static final DateTimeFormatter
            HHMM = ofPattern("HH:mm"),
            YYYY_MM_DD = ofPattern("yyyy-MM-dd"),
            YYYYMMDD = ofPattern("yyyy.MM.dd"),
            DD_MM_YYYY = ofPattern("dd.MM.yyyy"),
            DD_MM_YY_SLASH_HHMM = ofPattern("dd.MM.yy/HH:mm"),
            DD_MM_YYYY_SPACE_HH_MM = ofPattern("dd.MM.yyyy HH:mm"),
            YYYY_MM_DD_HH_MM_SS = ofPattern("yyyy-MM-dd HH:mm:ss");
}
