package belajar.kotlin.unit.test

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

class CalculatorTest {
    val calculator = Calculator()

    @Test fun testAddSuccess() {
        val result = calculator.add(10, 10)
        assertEquals(20, result, "Hasil harusnya 20")
    }

    @Test fun testAddSuccess2() {
        val result = calculator.add(20, 20)
        assertEquals(40, result, "Hasil harusnya 40")
    }

    @Test fun testDivideSuccess() {
        val result = calculator.divide(100, 10)
        assertEquals(10, result, "Hasil harusnya 10")
    }

    @Test fun testDivideError() {
        // mengecek apakah sebuah exception terjadi
        assertThrows<IllegalArgumentException> {
            calculator.divide(100, 0)
        }
    }
}