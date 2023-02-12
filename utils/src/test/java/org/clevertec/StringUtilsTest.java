package org.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("10"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("-1210"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("0000"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("0"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("-0"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("12.6"));
        Assertions.assertTrue(StringUtils.isPositiveNumber("1827262626553535352515111111111111111"));
    }

}