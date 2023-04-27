import org.junit.Assert;
import org.junit.Test;

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
        String resultFour = this.romanNumerals.convertToRoman(4);
        Assert.assertTrue(resultFour.equals("IV"));
        String resultFive = this.romanNumerals.convertToRoman(5);
        Assert.assertTrue(resultFive.equals("V"));
        String resultSeven = this.romanNumerals.convertToRoman(7);
        Assert.assertTrue(resultSeven.equals("VII"));
        String resultNine = this.romanNumerals.convertToRoman(9);
        Assert.assertTrue(resultNine.equals("IX"));
        String resultTen = this.romanNumerals.convertToRoman(10);
        Assert.assertTrue(resultTen.equals("X"));
        String resultEighteen = this.romanNumerals.convertToRoman(18);
        Assert.assertTrue(resultEighteen.equals("XVIII"));
        String resultThirty = this.romanNumerals.convertToRoman(30);
        Assert.assertTrue(resultThirty.equals("XXX"));
    }
}