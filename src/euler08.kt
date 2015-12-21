import java.io.File

fun euler08(n: Int): Long {
    val nums = File("res/euler08.txt").readBytes().filter{it.toChar() != '\n'}.map{(it-48).toInt()}
    var max: Long = 0
    for (i in n-1..nums.size-1) {
        var product: Long = 1
        for (j in 0..n-1) {
            product *= nums[i-j]
        }
        if (product > max) max = product
    }

    return max
}