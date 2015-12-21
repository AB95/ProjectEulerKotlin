

fun euler09(n: Int): Int {
    for (a in 1..n) {
        for (b in 1..n) {
            val c = n - (a+b)
            if (a.pow(2) + b.pow(2) == c.pow(2)) {
                return a*b*c
            }
        }
    }
    return 0
}
