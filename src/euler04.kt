

fun euler04(n: Int): Int {
    var max = 0
    for (i in 1..10.pow(n)-1) {
        for (j in 1..10.pow(n)-1) {
            if ((i*j).isPalindromic() and (i*j > max)) {
                max = i*j
            }
        }
    }
    return max
}

fun Int.isPalindromic(): Boolean {
    if (this.toString() == this.toString().reversed()) {
        return true
    }
    else {
        return false
    }
}

fun Int.pow(n: Int): Int {
    var x = this
    for (i in 1..n-1) {
        x *= this
    }
    return x
}