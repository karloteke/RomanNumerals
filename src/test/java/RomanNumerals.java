public final class RomanNumerals {
    RomanNumerals() {} // constructor privado y final para evitar instanciación

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 3000;

    public static String convertToRoman(final int number) {
        if (number < MIN_VALUE || number > MAX_VALUE) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3000.");
        }

        final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        final StringBuilder roman = new StringBuilder();
        int remainingNumber = number;

        for (int i = 0; i < symbols.length; i++) {
            while (remainingNumber >= values[i]) {
                roman.append(symbols[i]);
                remainingNumber -= values[i];
            }
        }

        return roman.toString();
    }
}

