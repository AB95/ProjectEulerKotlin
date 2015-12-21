

fun euler17(): Int {
    val oneToNine = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine").map { it.length }.sum()

    val tenToNineteen = listOf("ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen").map { it.length }.sum()

    val twentyToNinetyNine = listOf("twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety").map { it.length }.sum() * 10 + oneToNine * 8

    val oneHundredToNineHundredAndNinetyNine = oneToNine * 100 +
            (oneToNine + tenToNineteen + twentyToNinetyNine) * 9 +
            "hundred".length * 9 * 100 +
            "and".length * 9 * 99

    return oneToNine + tenToNineteen + twentyToNinetyNine + oneHundredToNineHundredAndNinetyNine + "one thousand".filter { it != ' '}.length
}