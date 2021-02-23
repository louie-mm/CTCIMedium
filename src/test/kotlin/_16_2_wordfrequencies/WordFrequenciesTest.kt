package _16_2_wordfrequencies

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class WordFrequenciesTest {

    @Test
    fun `WordFrequencies counts the number of occurrence of a word in a file`() {
        val file = File("src/test/kotlin/_16_2_wordfrequencies/PrideAndPrejudice.txt")
        val wordMap = wordFrequencies(file, setOf("love", "eat", "drive", "rain", "friend"))
        Assertions.assertEquals(92, wordMap["love"])
        Assertions.assertEquals(5, wordMap["eat"])
        Assertions.assertEquals(4, wordMap["drive"])
        Assertions.assertEquals(4, wordMap["rain"])
        Assertions.assertEquals(111, wordMap["friend"])
    }
}