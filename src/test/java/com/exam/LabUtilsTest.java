package com.exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LabUtilsTest {

    @Test
    void testFindLargest() {
        // Test data: 3, 9, 5 -> Largest is 9
        assertEquals(99, LabUtils.findLargest(3, 9, 5), "The largest number should be 9");
        
        // Extra test cases just to be thorough
        assertEquals(15, LabUtils.findLargest(15, 2, 8));
        assertEquals(7, LabUtils.findLargest(4, 4, 7));
    }
}