/*
* This package will print a calendar
*/
package ch13_calendar;

import java.util.*;

/**
 * The main
 * @author Zachary Hinote
 */
public class Ch13_Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yy = getUserYear();
        int month = getUserMonth();
        Calendar gregCal = new GregorianCalendar(yy, month - 1, 1);
        /*System.out.println("Today:\t\t\t " + gregCal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week: \t\t" + gregCal.get(Calendar.DAY_OF_MONTH));
        System.out.println("First Day of Week: \t" + gregCal.getFirstDayOfWeek());
        System.out.println("Month:\t\t\t" + gregCal.get(Calendar.MONTH));
        System.out.println("Last day of month:\t" + gregCal.getMaximum(Calendar.DAY_OF_MONTH));*/
        
        int lastDay = gregCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        String mm = gregCal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        System.out.println("          " + mm + ", " + yy);
        
        System.out.println("----------------------------");
        
        for (int i = 1; i <= 7; i++) {
            System.out.print(" " + dayNameOfWeek(i));
        }
        System.out.println();
        
        for(int i = 1; i <= lastDay; i++) {
            if (i % 7 == 0) {
                if (i < 10) {
                    System.out.println("   " + i);
                }
                else {
                    System.out.println("  " + i);
                }
            }
            else {
                if (i < 10) {
                    System.out.print("   " + i);
                }
                else {
                    System.out.print("  " + i);
                }
            }
        } 
        
        System.out.println("\n" + mm + ", " + yy + " contains " + gregCal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");
        
        
        
        
        
        /*Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is " + new Date());
        System.out.println("YEAR:\t" + calendar.get(Calendar.YEAR));
        System.out.println("MONTH:\t" + calendar.get(Calendar.MONTH));
        System.out.println("DATE:\t" + calendar.get(Calendar.DATE));
        System.out.println("HOUR:\t" + calendar.get(Calendar.HOUR));
        System.out.println("HOUR OF DAY:\t" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE:\t" + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND:\t" + calendar.get(Calendar.SECOND));
        
        System.out.println("DAY OF WEEK:\t" + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY OF MONTH:\t" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY OF YEAR:\t" + calendar.get(Calendar.DAY_OF_YEAR));
        
        System.out.println("AM/PM:\t" + calendar.get(Calendar.AM_PM));
        
        Calendar calendar1 = new GregorianCalendar(2001, 8, 11);
        System.out.println("September 11, 2001 is a " + dayNameOfWeek(calendar1.get(Calendar.DAY_OF_WEEK)));*/
    }
    public static String dayNameOfWeek(int dayOfWeek) {
        switch(dayOfWeek) {
            case 1: return "Sun";
            case 2: return "Mon";
            case 3: return "Tue";
            case 4: return "Wed";
            case 5: return "Thu";
            case 6: return "Fri";
            case 7: return "Sat";
            default: return null;
        }
    }
    
    /**
     * This method will prompt the user for the year
     * @return 
     */
    
    
    public static int getUserYear() {
        int userYear = 0;
        Scanner readInp;
        
        while (true) {
            try {
                readInp = new Scanner(System.in);
                System.out.print("Please enter a numeric year: ");
                userYear = readInp.nextInt();
                return userYear;
            }
            catch (Exception e) {
                System.out.println("Non-numeric input");
            }
        }
        
        
    }
    
    public static int getUserMonth() {
        int userMonth = 0;
        Scanner readInp;
        
        while (true) {
            try {
                readInp = new Scanner(System.in);
                System.out.print("Please enter a numeric month: ");
                userMonth = readInp.nextInt();
                return userMonth;
            }
            catch (Exception e) {
                System.out.println("Non-numeric input");
            }
        }
        
    }
    
}
