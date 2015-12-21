import java.math.BigInteger
import kotlin.math.div
import kotlin.math.minus
import kotlin.math.times

fun euler15(n: Int): BigInteger {
    val sideLength = BigInteger(n.toString())
    val pathLength = BigInteger((n*2).toString())
    return  pathLength.factorial() / (sideLength.factorial() * sideLength.factorial())
}

private fun BigInteger.factorial(): BigInteger {
    var fact = BigInteger.ONE
    var num = this
    while (num > BigInteger.ONE) {
        fact *= num
        num -= BigInteger.ONE
    }
    return fact
}