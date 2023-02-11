package org.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        StringUtils stringUtilsTest = new StringUtils();
        Assertions.assertTrue(stringUtilsTest.isPositiveNumber("10"));
        Assertions.assertFalse(stringUtilsTest.isPositiveNumber("-1210"));
        Assertions.assertFalse(stringUtilsTest.isPositiveNumber("0000"));
        Assertions.assertFalse(stringUtilsTest.isPositiveNumber("0"));
        Assertions.assertFalse(stringUtilsTest.isPositiveNumber("-0"));
        Assertions.assertFalse(stringUtilsTest.isPositiveNumber("12.6"));
        Assertions.assertTrue(stringUtilsTest.isPositiveNumber("1827262626553535352515111111111111111"));
    }

}