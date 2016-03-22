/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author trogers8
 */
public class DifferenceInDatesByHours {
    public static void main(String[] args) {
    LocalDateTime startDate = .getInstance();
    Calendar endDate = Calendar.getInstance();
    endDate.set(2016, Calendar.JULY, 14);
    
    Duration diff = Duration.between(startDate, endDate);
    
    }
    
    
    
}
