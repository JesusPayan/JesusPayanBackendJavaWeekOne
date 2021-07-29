package com.platzi.javatest.util;

public class  StringUtil {

    public static boolean isEmpty(String string) {

        if (string == "") {
                return  true;
            }else{
            return false;
        }
        }
        public static boolean isNotEmpy(String string){
            if(string != ""){
                return true;
            }else{
                return false;
            }

        }
        public static boolean isNull(String string){
            if(string == null) {
                return true;
             }else{
                return false;
            }
        }



    public static String repeatString(String string, int times){
        if (times < 0){
            throw new IllegalArgumentException("Negatives isn't allowed");
        }
        String resultString = "";
        for (int i = 0; i < times ; i++) {
            resultString += string;
        }
        return resultString;

    }
}
