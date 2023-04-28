import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {
    /**
     * Conversión numero 1.
     */
    private static final int ONE = 1;
    /**
     * Conversión numero 2.
     */
    private static final int TWO = 2;
    /**
     * Conversión numero 3.
     */
    private static final int THREE = 3;
    /**
     * Conversión numero 4.
     */
    private static final int FOUR = 4;
    /**
     * Conversión numero 5.
     */
    private static final int FIVE = 5;
    /**
     * Conversión numero 7.
     */
    private static final int SEVEN = 7;
    /**
     * Conversión numero 9.
     */
    private static final int NINE = 9;
    /**
     * Conversión numero 10.
     */
    private static final int TEN = 10;
    /**
     * Conversión numero 18.
     */
    private static final int EIGHTEEN = 18;
    /**
     * Conversión numero 30.
     */
    private static final int THIRTY = 30;
    /**
     * Instancia de la clase RomanNumerals para realizar
     * pruebas de conversión a números romanos.
     */

    RomanNumerals romanNumerals = new RomanNumerals();

    /**
     * Test de decimal a número romano.
     */
    @Test
    public void testConvertToRoman() {
        String resultOne = romanNumerals.convertToRoman(ONE);
        Assert.assertEquals("I", resultOne);
        String resultTwo = romanNumerals.convertToRoman(TWO);
        Assert.assertEquals("II", resultTwo);
        String resultThree = romanNumerals.convertToRoman(THREE);
        Assert.assertEquals("III", resultThree);
        String resultFour = romanNumerals.convertToRoman(FOUR);
        Assert.assertEquals("IV", resultFour);
        String resultFive = romanNumerals.convertToRoman(FIVE);
        Assert.assertEquals("V", resultFive);
        String resultSeven = romanNumerals.convertToRoman(SEVEN);
        Assert.assertEquals("VII", resultSeven);
        String resultNine = romanNumerals.convertToRoman(NINE);
        Assert.assertEquals("IX", resultNine);
        String resultTen = romanNumerals.convertToRoman(TEN);
        Assert.assertEquals("X", resultTen);
        String resultEighteen = romanNumerals.convertToRoman(EIGHTEEN);
        Assert.assertEquals("XVIII", resultEighteen);
        String resultThirty = romanNumerals.convertToRoman(THIRTY);
        Assert.assertEquals("XXX", resultThirty);
    }
}
