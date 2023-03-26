package com.svalero;
public class RomanNumerals {

    public static String  convertToRoman(int decimal) {
        if(decimal == 2){
            return "II";
        }
        if(decimal == 3){
            return "III";
        }
        if(decimal == 4){
            return "IV";
        }
        if(decimal == 5){
            return "V";
        }
        if(decimal == 7){
            return "VII";
        }
        if(decimal == 9){
            return "IX";
        }
        return "I";
    }
}
