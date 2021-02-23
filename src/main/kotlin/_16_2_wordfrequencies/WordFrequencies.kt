package _16_2_wordfrequencies

import java.io.File

/*
Design a method to find the frequency of occurrences of any given word in a book.
What if we were running this algorithm multiple times?
 */
fun wordFrequencies(file: File, words: Set<String>): Map<String, Int> {
    val wordMap = words
        .map { Pair(it, 0) }
        .toMap()
        .toMutableMap()

    file.forEachLine {
        val wordsInLine = it.trim().split("[^a-zA-Z]".toRegex())
        wordsInLine.forEach { wordInLine ->
            if(wordMap.contains(wordInLine)) {
                wordMap[wordInLine] = wordMap[wordInLine]!! + 1
            }
        }
    }
    return wordMap
}