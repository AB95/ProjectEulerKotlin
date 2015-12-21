import kotlin.util.measureTimeMillis

fun main(args: Array<String>) {
    val func = ::euler17
    val n = 1000
    println(measureTimeMillis{ println(func()) })
}