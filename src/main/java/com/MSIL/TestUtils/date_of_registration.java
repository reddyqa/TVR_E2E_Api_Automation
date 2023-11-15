package com.MSIL.TestUtils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class date_of_registration {
  public static void main(String[] args) {
    int year = 2022;
    
    // Create a LocalDate object for the current date
    LocalDate currentDate = LocalDate.now();
    
    // Create a LocalDate object for the date one year from now
    LocalDate oneYearFromNow = LocalDate.of(year, currentDate.getMonth(), currentDate.getDayOfMonth())
                                      .plusYears(1);
    
    // Format the date using a DateTimeFormatter
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formattedDate = oneYearFromNow.format(formatter);
    
    System.out.println("Date one year from now: " + formattedDate);
  }
  
}
