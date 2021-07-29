package com.platzi.javatest.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    enum Ooptions{
        OK, ERROR
    }
    @Test
    public void testRepeat(){

        Assert.assertEquals(StringUtil.repeatString("hola",1),"hola");
    }
    @Test
    public void testRepeatMultipleTimes(){
        Assert.assertEquals(StringUtil.repeatString("hola",3),"holaholahola");
    }
    @Test
    public void testRepeatZeroTimes(){
        Assert.assertEquals(StringUtil.repeatString("hola",0),"");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRepeatNegativeTimes(){
        Assert.assertEquals(StringUtil.repeatString("hola",-1),"");
    }
    @Test
    public void isAndEmptyText(){
        //Assert.assertEquals(StringUtil.isEmpty(""),"");
        if(StringUtil.isEmpty("")==true){
            System.out.println(Ooptions.OK);
        }
    }
    @Test
    public void isAndNullText(){
        if(StringUtil.isNotEmpy(null )==true) {
            System.out.println(Ooptions.OK);
        }
    }
    @Test
    public void isNotEmpyTest(){
        if(StringUtil.isNotEmpy("hola" )==true) {
            System.out.println(Ooptions.OK);
        }
    }
    @Test
    public void hasAndSpace(){
        if(StringUtil.isNotEmpy(" " )==true) {
            System.out.println(Ooptions.OK);
        }
    }
}
/*
    public static void main(String[] args) {

        Assert.assertEquals(StringUtil.repeatString("hola",3),"holaholahola");

        Assert.assertEquals(System.out.println(StringUtil.repeatString("hola",3));

        System.out.println(StringUtil.repeatString("hola",1));
        /*
        if(!StringUtil.repeatString("hola",3).equals("holaholahola")){
            System.out.println("Error en test");


        }else{

            //System.out.println("todo bien");
        }
        if(!StringUtil.repeatString("hola",1).equals("hola")){
            System.out.println("Error en test");
            throw new RuntimeException("Error");
        }else{
            System.out.println("todobien");
        }
    }

    private static void assertEqualss(String actual, String expected) {
        if(!actual.equals(expected)){
            throw new RuntimeException("Error:" + actual + "\nNo es el esperado:" +expected);
        }
    }
*/
