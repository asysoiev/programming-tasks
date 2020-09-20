package com.sandbox.programming;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortOddAndEvenNumbersTest {

    private Algorithms algorithms = new AlgorithmsImpl();

    @Test
    public void testStartAndEndsOnEven() {
        String src = "6 1 2 3 4 5 6";
        String expected = "1 6 3 4 5 2";

        String actual = algorithms.sortOddAndEvenNumbers(src);
        assertEquals(expected, actual);
    }

    @Test
    public void testStartOnOddAndEndsOnEven() {
        String src = "9 4 7 4 6 7 1 4 5 8";
        String expected = "8 1 6 4 5 7 4 7 4";

        String actual = algorithms.sortOddAndEvenNumbers(src);
        assertEquals(expected, actual);
    }
}