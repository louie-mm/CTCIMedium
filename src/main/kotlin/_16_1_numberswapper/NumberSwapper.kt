package _16_1_numberswapper

/*
Write a function to swap a number in place
(that is, without temporary variables)
 */

fun numberSwapper(t: Pair<Int , Int>): Pair<Int, Int> {
    var a = t.first
    var b = t.second

    a += b
    b = a - b
    a -= b

    return Pair(a, b)
}
