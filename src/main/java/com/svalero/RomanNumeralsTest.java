package com.svalero;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static sun.nio.cs.Surrogate.is;

public class RomanNumeralsTest {
    RomanNumerals romanNumerals = new RomanNumerals();
    @Test
    public void test_convert_to_roman() {
        String resultOne = this.romanNumerals.convertToRoman(1);
        Assert.assertTrue(resultOne.equals("I"));
    }
}