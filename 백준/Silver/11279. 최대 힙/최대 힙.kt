import java.util.PriorityQueue


fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    val pq  = PriorityQueue(reverseOrder<Int>())

    repeat(n) {
        val x = readLine().toInt()
        if (x == 0) {
            if (pq.isNotEmpty()) {
                println(pq.poll())
            } else {
                println(0)
            }
        } else {
            pq.add(x)
        }


    }
}