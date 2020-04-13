/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDate;
/**
 *
 * @author zslay
 */
public class datetime {
    private static DateTimeFormatter TimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    
    public static String DisplayTime(){
        LocalTime TimeNow = LocalTime.now();
        String time = TimeNow.format(TimeFormat);
        return time + " Local Time";
    }
    
    public static String DisplayDate(){
        LocalDate DateNow = LocalDate.now();
        String day = DateNow.getDayOfWeek().name().toUpperCase();
        String date = DateNow.format(DateFormat);
        String disp = day + ", " + date;
        return disp;
    }
}
