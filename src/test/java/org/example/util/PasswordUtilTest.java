package org.example.util;

import org.example.util.PasswordUtil.SecurityLevel;
import org.junit.Test;

import static org.example.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

  @Test
  public void weak_when_has_less_than_8_letters(){
         assertEquals(WEAK,PasswordUtil.assessPassword("1234567"));

  }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("abusidoesd"));

    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM,PasswordUtil.assessPassword("aASdfsA12!jo"));

    }

    @Test
    public void strong_when_has_letters_symbols_and_numbers(){
        assertEquals(STRONG,PasswordUtil.assessPassword("123dfs7jo2"));
    }



}