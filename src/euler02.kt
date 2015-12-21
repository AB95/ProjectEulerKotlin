

fun euler02(n: Int): Int {
    var nums = arrayListOf(1, 2)
    while (nums.last() < n) {
        nums.add(nums.last() + nums.reversed()[1])
    }
    return nums.filter{it % 2 == 0}.sum()
}