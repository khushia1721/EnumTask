/*   Created by IntelliJ IDEA.
 *   Author: Khushi Agarwal
 *   Date: 28-10-2020
 */

package lab;
// Create a program in java to demonstrate the working of Enums.

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

enum Months {
    JANUARY(31), FEBRUARY(29), MARCH(31), APRIL(30),
    MAY(31), JUNE(30), JULY(31), AUGUST(31),
    SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

    private final int numberOfDays;

    Months(int numberOfDays) {
        this.numberOfDays = numberOfDays;

    }
}
public class Main {
    public static void main(String[] args) {
        int currentDate = new GregorianCalendar().get(Calendar.DATE);
        String currentMonth = new GregorianCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        int totalNumberOfDays = new GregorianCalendar().getActualMaximum(Calendar.DAY_OF_MONTH);
        int noOfDaysLeft = totalNumberOfDays - currentDate;
        System.out.println(noOfDaysLeft + " days left in " + currentMonth + "!");

