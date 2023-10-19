package com.MSIL.TestUtils;

import java.time.LocalDate;
import java.time.Year;
import java.util.Random;

public class RandomNameGenerator {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final int NAME_LENGTH = 6;

    public static String generateName() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < NAME_LENGTH; i++) {
            sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        return sb.toString();
    }
   

    public static int GenerateKM() {
            Random rand = new Random();
            int randomNumber = rand.nextInt(90000) + 10000;
            System.out.println(randomNumber);
			return randomNumber;
        
    }
    
   

    public static String PhoneNumberGenerator() {
            Random rand = new Random();
            String phoneNum = "9";
            for (int i = 1; i < 10; i++) {
                phoneNum += rand.nextInt(10);
            }
            return phoneNum;
        }
    


   

    public static String generateDateWithYear(String value) {
        // Get the current year
        int currentYear = Year.now().getValue();
        int value1 = Integer.parseInt(value);        // Calculate the difference between the current year and the specified year
        int yearDiff = value1 - currentYear;

        // Create a date object one year from the current date with the specified year
        return LocalDate.now().plusYears(yearDiff).plusYears(1).toString();
    }


    public static void main(String[] args) {
        String randomName = generateName();
        System.out.println(randomName);
    }
}

