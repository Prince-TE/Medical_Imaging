package genericUtility;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class GetCurrentDate {
    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static int getCurrentYear(LocalDate date) {
        return date.getYear();
    }

    public static String getCurrentMonth(LocalDate date) {
        return date.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH).substring(0, 3);
    }

    public static int getCurrentDay(LocalDate date) {
        return date.getDayOfMonth();
    }
}
