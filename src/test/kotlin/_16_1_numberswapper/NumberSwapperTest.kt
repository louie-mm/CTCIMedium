package _16_1_numberswapper

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.RepeatedTest
import kotlin.random.Random

class NumberSwapperTest {

    @RepeatedTest(10)
    fun `NumberSwapper swaps the numbers public class in place`() {
        val first = Random.nextInt()
        val second = Random.nextInt()
        val swappedNumbers = numberSwapper(Pair(first, second))
        Assertions.assertEquals(first, swappedNumbers.second)
        Assertions.assertEquals(second, swappedNumbers.first)
    }
}