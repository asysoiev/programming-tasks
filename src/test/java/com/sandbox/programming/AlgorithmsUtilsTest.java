package com.sandbox.programming;


import org.junit.Test;

import static com.sandbox.programming.AlgorithmsUtils.reverseString;
import static com.sandbox.programming.AlgorithmsUtils.sortOddAndEvenNumbers;
import static org.junit.Assert.assertEquals;

public class AlgorithmsUtilsTest {

    @Test
    public void testStartAndEndsOnEven() {
        String src = "6 1 2 3 4 5 6";
        /* orig req:
        if a position had an even number previously, it continues to have an even number even after this sorting has been done
         */
//        String expected =     "1 6 3 4 5 2";//in original
        String expected = "6 1 6 3 4 5 2";

        String actual = sortOddAndEvenNumbers(src);
        assertEquals(expected, actual);
    }

    @Test
    public void testStartOnOddAndEndsOnEven() {
        String src = "9 4 7 4 6 7 1 4 5 8";
//        String expected = "8 1 6 4 5 7 4 7 4";
        String expected = "1 8 5 6 4 7 7 4 9 4";

        String actual = sortOddAndEvenNumbers(src);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseString() {
        String input = "uhsnamiH";
        String expected = "Himanshu";

        String actual = reverseString(input);
        assertEquals(expected, actual);
    }
}