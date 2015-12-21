import java.io.File
import java.math.BigInteger
import kotlin.math.plus

fun euler13(n: Int) = File("res/euler13.txt").readLines().map { BigInteger(it) }.reduce { total, next -> total + next }.toString().substring(0..n-1).toLong()