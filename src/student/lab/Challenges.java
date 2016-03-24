/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author trogers8
 */
public class Challenges {
    public static void main(String[] args) {
    // Find the difference between two dates in hours
    LocalDateTime startDate = LocalDateTime.now();
    LocalDateTime endDate = startDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
    System.out.println(startDate.until(endDate, ChronoUnit.HOURS));
    
    // Find the last business day numerical value (e.g., 30) of the month given a known
    // value for the last business day String value of the week (e.g., "Friday")
    LocalDate today = LocalDate.now();
    LocalDate lastDay = today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
    System.out.println(lastDay.getDayOfMonth());
    
    // Find the difference between two dates, resulting in hours plus 
    // leftover minutes. So, e.g., 90 minutes is 1 hours and 30 minutes
    LocalDateTime startDate2 = LocalDateTime.now();
   
     LocalDateTime endDate2  = startDate2.plusMinutes(3459);
    long minutes = startDate2.until(endDate2, ChronoUnit.MINUTES);
    int hours = (int)(minutes/60);
    minutes = minutes - hours*60;
    System.out.println(hours + " Hours and " + minutes + " Minutes");
    
    // Based on the current, local date and time, calculate the current
        // date and time right now in Berlin, Germany
    LocalDateTime startDate3 = LocalDateTime.now();
    ZonedDateTime germanTime = startDate3.atZone(ZoneId.of("Europe/Berlin"));
        System.out.println(germanTime);
    
    // Calculate a due date that is 15 days from now
    LocalDateTime startDate4 = LocalDateTime.now();
    LocalDateTime dueDate = startDate4.plusDays(15);
    System.out.println("Due Date " + dueDate);
    
    
    // On what year will the next leap year happen?
    int year = startDate4.getYear() + 1;
    while(!Year.isLeap(year)){
        year++;
    }
        System.out.println(year);
    }
    
    
    
}
