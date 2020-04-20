// https://www.hackerrank.com/challenges/countingsort2/problem

fun countingSort(arr: Array<Int>): Array<Int> {
    val counts = Array(size = 100, init = { 0 })
    val result = Array(size = arr.size, init = { 0 })

    arr.forEach { counts[it]++ }

    var idx = 0
    counts.forEachIndexed { index, value ->
        if (value > 0) {
            for (i in 1..value) {
                result[idx++] = index
            }
        }
    }

    return result
}

fun main() {
    println(countingSort(intArrayOf(1, 2, 3, 2, 1).toTypedArray()).toList())
}