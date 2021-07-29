package com.clasesreforzamiento.cesaramaya.equals;

import java.util.Date;
import java.util.Objects;

public class MyDate {
    private int day;
    private int month;
    private int year;

    MyDate() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = day;
        this.year = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




    @Override
    public boolean equals(Object obj) {



        if (obj != null) {
            return ((this.hashCode() == obj.hashCode()) & (this.getClass() == obj.getClass())) ? true : false;
        } else {

            return false;
        }
    }
                /*
                                        if((obj != null) && (this.hashCode() == obj.hashCode()) && (this.getClass() == obj.getClass()) ){
                                                    return true;
                                        }else{
                                                    new Date();
                                                    return false;
                                        }*/
 }


