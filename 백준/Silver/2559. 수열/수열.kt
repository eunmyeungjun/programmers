

fun main() = with(System.`in`.bufferedReader()) {


    val (n,k) = readLine().split(" ").map{ it.toInt() }

    val arr = readLine().split(" ").map {it.toInt()}.toMutableList()



    val prefix = IntArray(n+1)

    prefix[0] = 0

    var max = Int.MIN_VALUE

    for(i in 1..n) {

    prefix[i] = prefix[i-1] + arr[i-1]

}





    for (j in k until prefix.size) {

        max = maxOf( max, prefix[j] - prefix[j-k])

    }

    println(max)

}