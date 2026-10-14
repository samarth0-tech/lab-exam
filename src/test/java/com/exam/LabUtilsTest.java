package com.exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LabUtilsTest {

    @Test
    void testSumArray() {
        int[] testArray = {1, 2, 3, 4, 5};
        assertEquals(15, LabUtils.sumArray(testArray), "The sum should be 15");
    }
}