package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        Assertions.assertTrue(Utils.isAllPositiveNumbers("10", "33", "112"));
        Assertions.assertTrue(Utils.isAllPositiveNumbers("1827262626553535352515111111111111111"));

        Assertions.assertFalse(Utils.isAllPositiveNumbers("-1210", "10"));
        Assertions.assertFalse(Utils.isAllPositiveNumbers("0000", "20"));
        Assertions.assertFalse(Utils.isAllPositiveNumbers("0"));
        Assertions.assertFalse(Utils.isAllPositiveNumbers("-0"));
        Assertions.assertFalse(Utils.isAllPositiveNumbers("12.6"));
    }
}