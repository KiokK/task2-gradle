package org.example;

import org.clevertec.StringUtils;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(el -> StringUtils.isPositiveNumber(el));
    }
}
