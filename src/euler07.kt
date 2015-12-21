

fun euler07(n: Int): Int {
    var x = 1
    for (i in 1..n) {
        x = x.nextPrime()
    }
    return x
}

fun Int.isPrime() = if (this <= 1) false else (2..Math.sqrt(this.toDouble()).toInt()).all{ this % it != 0 }

private fun Int.nextPrime(): Int {
    if (this <= 1) {
        return 2
    }
    else if (this % 2 == 0) {
        if (this == 2) return 3
        else return (this-1).nextPrime()
    }
    else {
        var x = this + 2
        while (!x.isPrime()) {
            x += 2
        }
        return x
    }
}