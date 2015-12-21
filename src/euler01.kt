

fun euler01(n: Int) = (1..n-1).filter{(it % 3 == 0) or (it % 5 == 0)}.sum()