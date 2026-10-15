package com.exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LabUtilsTest {

    @Test
    void testCalculateSimpleInterest() {
        // Test data: Principal = 1000, Rate = 5%, Time = 2 years
        // Formula: (1000 * 5 * 2) / 100 = 100.0
        assertEquals(100.0, LabUtils.calculateSimpleInterest(1000, 5, 2), "The simple interest should be 100.0");
    }
}