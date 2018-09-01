package org.chiknrice

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    void testAdd() {
        Assertions.assertEquals(3.5, Calculator.add(1, 2.5))
    }

}
