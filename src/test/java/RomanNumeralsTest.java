import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SEVEN = 7;
    private static final int NINE = 9;
    private static final int TEN = 10;
    private static final int EIGHTEEN = 18;
    private static final int THIRTY = 30;

    private final RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void testConvertToRoman() {
        String resultOne = romanNumerals.convertToRoman(ONE);
        Assert.assertTrue(resultOne.equals("I"));
        String resultTwo = romanNumerals.convertToRoman(TWO);
        Assert.assertTrue(resultTwo.equals("II"));
        String resultThree = romanNumerals.convertToRoman(THREE);
        Assert.assertTrue(resultThree.equals("III"));
        String resultFour = romanNumerals.convertToRoman(FOUR);
        Assert.assertTrue(resultFour.equals("IV"));
        String resultFive = romanNumerals.convertToRoman(FIVE);
        Assert.assertTrue(resultFive.equals("V"));
        String resultSeven = romanNumerals.convertToRoman(SEVEN);
        Assert.assertTrue(resultSeven.equals("VII"));
        String resultNine = romanNumerals.convertToRoman(NINE);
        Assert.assertTrue(resultNine.equals("IX"));
        String resultTen = romanNumerals.convertToRoman(TEN);
        Assert.assertTrue(resultTen.equals("X"));
        String resultEighteen = romanNumerals.convertToRoman(EIGHTEEN);
        Assert.assertTrue(resultEighteen.equals("XVIII"));
        String resultThirty = romanNumerals.convertToRoman(THIRTY);
        Assert.assertTrue(resultThirty.equals("XXX"));
    }
}
