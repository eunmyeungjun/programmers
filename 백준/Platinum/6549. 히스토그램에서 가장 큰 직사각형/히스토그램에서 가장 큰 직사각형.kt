import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    var squares: String

    while (true) {
        squares = readLine()

        if (squares == "0") break

        val list = squares.split(" ").map { it.toLong() }
        val n = list[0].toInt()
        val num = list.subList(1, list.size).toLongArray()

        val stack = Stack<Int>()
        var answer = 0L

        for (i in 0 until n) {
            while (stack.isNotEmpty() && num[stack.peek()] >= num[i]) {
                val height = num[stack.pop()]
                val width = if (stack.isEmpty()) i else i - stack.peek() - 1
                answer = maxOf(answer, height * width)
            }
            stack.push(i)
        }

        while (stack.isNotEmpty()) {
            val height = num[stack.pop()]
            val width = if (stack.isEmpty()) n else n - stack.peek() - 1
            answer = maxOf(answer, height * width)
        }

        println(answer)
    }
}