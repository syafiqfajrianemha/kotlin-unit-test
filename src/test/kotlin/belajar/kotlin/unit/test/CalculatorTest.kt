package belajar.kotlin.unit.test

import org.junit.jupiter.api.Test

class CalculatorTest {
    val calculator = Calculator()

    @Test fun testAddSuccess() {
        val result = calculator.add(10, 10)
    }

    @Test fun testAddSuccess2() {
        val result = calculator.add(10, 10)
    }
}