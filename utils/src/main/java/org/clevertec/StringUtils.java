package org.clevertec;

public class StringUtils{
    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str) &&
                !(org.apache.commons.lang3.StringUtils.stripStart(str, "0") + "0").equals("0");
    }
}
