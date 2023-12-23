package org.ot5usk.assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Asserts {

    public static void checkText(String expectedText, String actualText) {
        assertEquals(expectedText, actualText);
    }
}
