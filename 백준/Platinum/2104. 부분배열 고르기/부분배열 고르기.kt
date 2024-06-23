import java.util.Stack


fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt() 
    val arr = readLine().split(" ").map { it.toInt() }
    val left = IntArray(n) 
    val right = IntArray(n) 
    val prefixSum = LongArray(n + 1) 
    val stack = Stack<Int>()
    var maxScore = 0L

    for (i in 1..n) {
        prefixSum[i] = prefixSum[i - 1] + arr[i - 1]
    }

    for (i in 0 until n) {

        while (stack.isNotEmpty() && arr[stack.last()] >= arr[i]) {
            stack.removeAt(stack.size - 1)
        }
        left[i] = if (stack.isEmpty()) 0 else stack.last() + 1
        stack.add(i) 
    }
    stack.clear()

    for (i in n - 1 downTo 0) {
        while (stack.isNotEmpty() && arr[stack.last()] >= arr[i]) {
            stack.removeAt(stack.size - 1)
        }
        right[i] = if (stack.isEmpty()) n - 1 else stack.last() - 1
        stack.add(i) 
    }

    for (i in 0 until n) {
        val totalSum = prefixSum[right[i] + 1] - prefixSum[left[i]] 
        val score = totalSum * arr[i] 
        if (score > maxScore) {
            maxScore = score 
        }
    }
    println(maxScore) 
}