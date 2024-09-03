    import java.util.PriorityQueue

    
fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()
    val rpq = PriorityQueue(reverseOrder<Int>())

    repeat(n) {
        val present = readLine().trim()

        if (present == "0"){
           if (rpq.isEmpty()) println(-1)
            else println(rpq.poll())
        } else {
            val prToInt = present.split(" ").map { it.toInt() }
            val first = prToInt[0]
            for (i in 1..first) {
                rpq.add(prToInt[i])
            }

        }

    }
}