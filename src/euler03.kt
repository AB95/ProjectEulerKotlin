

fun euler03(n: Long): Int {
    var num = n
    while (num % 2 <= 0) {
        num /= 2
    }

    var divisor = 3
    while (num > 1) {
        if (num % divisor <= 0) {
            num /= divisor
        }
        else {
            divisor += 2
        }
    }

    return divisor
}