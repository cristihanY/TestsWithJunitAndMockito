package org.example.romanNumerals;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void test_arabic_number(){
        assertThat(RomanNumerals.arabicToRoman(2507), is("MMDVII"));
    }

}