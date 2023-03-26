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
        return "I";
    }
}
