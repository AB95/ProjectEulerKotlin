

fun euler12(n: Int): Int {
    var num = 1
    var count = 1
    while (num.numOfDivisors() <= n) {
        num += ++count
    }
    return num
}

private fun Int.numOfDivisors(): Int {
    var divisor = 2
    var num = 2
    while (divisor.pow(2) < this) {
        if (this % divisor == 0) num += 2
        divisor++
    }
    if (this % divisor == 0) num++
    return num
}