package org.chiknrice

import org.junit.jupiter.api.Test

import static org.chiknrice.Calculator.add
import static org.chiknrice.Calculator.subtract
import static org.junit.jupiter.api.Assertions.assertEquals

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(3.5, add(1, 2.5))
    }

    @Test
    void testSubtract() {
        assertEquals(2.75, subtract(5, 2.25))
    }

}
