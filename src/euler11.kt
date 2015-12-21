import java.io.File

fun euler11(n: Int): Int {
    val nums = File("res/euler11.txt").readLines().map { it.split(" ").map { it.toInt() } }
    return listOf(findHorizontal(nums, n), findVertical(nums, n), findDiagonalUp(nums, n), findDiagonalDown(nums, n)).max()!!
}

private fun findHorizontal(nums: List<List<Int>>, n:Int): Int {
    var max = 0
    for (i in 0..nums.size-1) {
        for (j in 0..nums[0].size-n) {
            val product = nums[i].slice(j..j+(n-1)).reduce { total, next -> total * next }
            if (product > max) max = product
        }
    }
    return max
}

private fun findVertical(nums: List<List<Int>>, n: Int): Int {
    var max = 0
    for (i in 0..nums[0].size-1) {
        for (j in 0..nums.size-n) {
            var product = 1
            for (k in 0..n-1) {
                product *= nums[j+k][i]
            }
            if (product > max) max = product
        }
    }
    return max
}

private fun findDiagonalUp(nums: List<List<Int>>, n: Int): Int {
    var max = 0
    for (i in n-1..nums.size-1) {
        for (j in 0..nums[0].size-n) {
            var product = 1
            for (k in 0..n-1) {
                product *= nums[i-k][j+k]
            }
            if (product > max) max = product
        }
    }
    return max
}

private fun findDiagonalDown(nums: List<List<Int>>, n: Int): Int {
    var max = 0
    for (i in 0..nums.size-n) {
        for (j in 0..nums[0].size-n) {
            var product = 1
            for (k in 0..n-1) {
                product *= nums[i+k][j+k]
            }
            if (product > max) max = product
        }
    }
    return max
}