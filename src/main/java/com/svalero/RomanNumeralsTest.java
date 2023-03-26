package com.svalero;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RomanNumeralsTest {
    RomanNumerals romanNumerals = new RomanNumerals();
    @Test
    public void test_convert_to_roman() {
        String resultOne = this.romanNumerals.convertToRoman(1);
        Assert.assertTrue(resultOne.equals("I"));
        String resultTwo = this.romanNumerals.convertToRoman(2);
        Assert.assertTrue(resultTwo.equals("II"));
        String resultThree = this.romanNumerals.convertToRoman(3);
        Assert.assertTrue(resultThree.equals("III"));

    }
}