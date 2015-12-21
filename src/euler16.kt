import java.math.BigInteger

fun euler16(n: Int) = BigInteger("2").pow(n).toString().map { it.toInt()-48 }.reduce { total, next -> total + next }