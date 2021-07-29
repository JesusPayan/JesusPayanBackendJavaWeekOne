package com.clasesreforzamiento.cesaramaya.equals;

public class TestMyDate {
    /*Write the missing code, and override the equals method in
    MyDate class, so that it can compare that when two MyDate objects have the same year, month and day,
    the result is true, otherwise false.
    The expected output is:
        -m1 != m2
        -m1 is equal to m2
        -m3 is not equal to m1 or m2

    */
            public static void main(String[] args) {

                        MyDate m1 = new MyDate(2,8,2019);
                        MyDate m2 = new MyDate(2,8,2019);
                        MyDate m3 = new MyDate(2,8,2019);
                        if(m1==m2) {
                                System.out.println("m1 == m2");
                        }else {
                                System.out.println("m1 != m2");
                        }
                       m1 =  m2;
                        if(m1.equals(m2)) {
                                System.out.println("m1 is equal to m2");
                        }else {
                                System.out.println("m1 is not equal to m2");
                        }

                    // Compare if m3 is equals to m1 or m2
                      if(m3.equals(m1) ) {
                                System.out.println("m3 is equal to m1 or m2");
                      }else {
                                System.out.println("m3 is not equal to m1 or m2");
                      }

            }

}

