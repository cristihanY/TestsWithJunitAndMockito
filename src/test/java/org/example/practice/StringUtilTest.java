package org.example.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {


    @Test
    public void  is_string_not_clean(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void  is_string_not_null(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void  is_string_space(){
        assertTrue(StringUtil.isEmpty("      "));
    }


}