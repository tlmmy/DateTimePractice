package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utility class to simplify managing and using dates and times, using the new
 * Java Date/Time API (JDK 8).
 *
 * @since JDK 8
 *
 * @author trogers8
 *
 * @version 1.02
 */
public class DateUtilities {

    private LocalDateTime dateTime;
    private DateTimeFormatter formatter;
    

    /**
     *
     * @return the current date as a String
     * @throws IllegalArgumentException
     */
    public String currentDateToString() throws IllegalArgumentException {
        LocalDate localeDate = LocalDate.now();
        formatter = DateTimeFormatter.ofPattern("mm-dd-yy hh:mm");
        String currentDate = localeDate.format(formatter);
        return currentDate;

    }

    /**
     * This returns the local date and time as a string with a specific format (MM-dd-yy HH:mm).
     *
     * @param date- the string to be formatted as a date
     * @return- dateTime
     * @throws IllegalArgumentException
     */
    public LocalDateTime getCustomDateString(String date) throws IllegalArgumentException {
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("Error: The date Input is empty.");
        } else {
            formatter = DateTimeFormatter.ofPattern("MM-dd-yy HH:mm");
            dateTime = LocalDateTime.parse(date, formatter);
        }

        return dateTime;
    }

    /**
     * This returns the local date as a string with a basic format
     *
     * @param date- the string to be formatted as a date
     * @return- date
     * @throws IllegalArgumentException
     */
    public LocalDate getDateString(String date) throws IllegalArgumentException {
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("Error: The local date could not be read.");
        } else {
            LocalDate formattedDate = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
            return formattedDate;
        }
    }
    /**
     * This returns the current date plus however many days you want
     *
     * @param days- the weeks you want to add to the current date
     * @return- laterDate
     * @throws IllegalArgumentException
     */
    public LocalDate addDaysToDate(int days) throws IllegalArgumentException{
        if (days == 0) {
            throw new IllegalArgumentException("Error: Days to be added must be greater than 0.");
        } else {
        LocalDate today = LocalDate.now();
        LocalDate laterDate = today.plusDays(days);
        return laterDate;
    }

}






}