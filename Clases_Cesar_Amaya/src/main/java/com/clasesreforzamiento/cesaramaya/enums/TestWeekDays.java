package com.clasesreforzamiento.cesaramaya.enums;

import java.util.Scanner;

public class TestWeekDays {
    public static void main(String[] args) {
        System.out.println("Select a number day: ");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch (option){
                    case 1:
                        System.out.println(WeekDays.MONDAY);
                        break;
                    case 2:
                        System.out.println(WeekDays.TUESDAY);
                        break;
                    case 3:
                        System.out.println(WeekDays.WEDNESDAY);
                        break;
                    case 4:
                        System.out.println(WeekDays.THURSDAY);
                        break;
                    case 5:
                        System.out.println(WeekDays.FRIDAY);
                        break;
                    case 6:
                        System.out.println(WeekDays.SATURDAY);
                        break;
                    case 7:
                        System.out.println(WeekDays.SUNDAY);
                        break;
        }
    }
}
