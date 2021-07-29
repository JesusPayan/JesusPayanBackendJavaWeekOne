package com.platzi.javatest.util;

public class DateUtil {

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        isLeap = (year % 4 != 0 && year % 100 == 0 && year % 400 != 0) ?true:false;
        System.out.println("valor is leap" + isLeap);
        /*
        if {
            return false;

        } else if (year % 4 == 0 || year % 400 == 0) {
            return true;
        }
*/
         return isLeap;
        }
    }

