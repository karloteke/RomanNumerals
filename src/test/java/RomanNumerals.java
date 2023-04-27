public class RomanNumerals {

    public static String convertToRoman(int numero) {
        if (numero < 1 || numero > 3000) {
            //Excepción números comprendidos entre 1 y 3000
            throw new IllegalArgumentException("El número debe estar entre 1 y 3000.");
        }
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder romano = new StringBuilder();

        for (int i = 0; i < simbolos.length; i++) {
            while (numero >= valores[i]) {
                romano.append(simbolos[i]);
                numero -= valores[i];
            }
        }
        return romano.toString();
    }
}
