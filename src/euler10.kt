

fun euler10(n: Int): Long {
    var flags: BooleanArray = BooleanArray(n)
    for (i in 1..n-1) flags[i] = true
    flags[0] = false
    flags[1] = false

    for ((index, value) in flags.withIndex()) {
        if (value && index < Math.sqrt(n.toDouble())) {
            for (i in index.pow(2)..n-1 step index) {
                flags[i] = false
            }
        }
    }

    return (1..n-1).filter{flags[it]}.map{it.toLong()}.sum()
}