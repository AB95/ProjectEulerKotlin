import java.io.File

fun euler67(): Int {
    var lines = File("res/euler67.txt").readLines().map { it.split(' ').map { it.toInt() }.toArrayList() }.toArrayList()
    for (line in lines.size-2 downTo 0) {
        for (i in 0..lines[line].size-1) {
            lines[line][i] += Math.max(lines[line+1][i], lines[line+1][i+1])
        }
    }
    return lines[0][0]
}