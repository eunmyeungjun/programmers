import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var answer = 0L
    val stack = Stack<Pair<Long,Long>>()

    repeat(n) {
        var nowHeight = readLine().toLong()
        var nextHeight = Pair(nowHeight, 1L)

        while (stack.isNotEmpty() && stack.peek().first <= nowHeight) {
            val top = stack.pop()
            answer += top.second

            if (top.first == nowHeight) nextHeight = Pair(top.first, top.second +1)
        }
        if (stack.isNotEmpty()) answer++
        stack.push(nextHeight)

    }

    println(answer)

}