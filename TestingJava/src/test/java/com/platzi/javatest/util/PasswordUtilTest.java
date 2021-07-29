package com.platzi.javatest.util;

import org.junit.Test;

import java.security.Security;
import java.util.WeakHashMap;

import static org.junit.Assert.*;
import com.platzi.javatest.util.PasswordUtil.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_less_8_letters(){
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1234567"));
    }
    public void weak_when_has_only_letters(){
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefg"));
    }

    public void weak_when_only_have_numbers(){
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1234567"));
    }
    public void medium_when_has_letters_and_numbers(){
        assertEquals(SecurityLevel.MEDIUM, PasswordUtil.assessPassword("1234567"));
    }
    public void strong_when_has_letters_and_numbers_and_special_characters(){
        assertEquals(SecurityLevel.STRONG, PasswordUtil.assessPassword("!ADDDd&%"));
    }



}