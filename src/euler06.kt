

fun euler06(n: Int) = (1..n).sum().pow(2) - (1..n).map{it.pow(2)}.sum()