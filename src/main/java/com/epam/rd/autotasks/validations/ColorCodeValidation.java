package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if(color == null){
            return false;
        }
        Pattern  hexPattern = Pattern.compile("#[\\dA-Fa-f]{3}([\\dA-Fa-f]{3})?");
        Matcher matcher = hexPattern.matcher(color);
        return matcher.matches();
    }
}





