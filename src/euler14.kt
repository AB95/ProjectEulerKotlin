

fun euler14(n: Int): Int {
    var max = 0
    var maxNum = 0
    for (i in 3..n step 2) {
        var chain = i.toLong().collatzLength()
        if (chain > max) {
            max = chain
            maxNum = i
        }
    }
    return maxNum
}

private fun Long.collatzLength(): Int {
    var n = this
    var counter = 1
    while (n > 1) {
        if (n % 2 <= 0) n /= 2
        else n = 3*n + 1
        counter++
    }
    return counter
}