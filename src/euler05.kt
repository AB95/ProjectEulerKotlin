

fun euler05(n: Int): Int {
    if (n <= 1) {
        return n
    }
    else {
        val step = euler05(n-1)
        var num = step
        while (!(1..n).all {num % it == 0}) {
            num += step
        }
        return num
    }
}