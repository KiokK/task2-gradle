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
    }

}