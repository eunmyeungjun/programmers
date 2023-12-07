import java.util.*
class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
            val hamburger = listOf(1, 2, 3, 1)
    val stack = Stack<Int>()
    

    for (i in ingredient) {
        stack.push(i)
        while (stack.size >= 4 && stack.subList(stack.size - 4, stack.size) == hamburger) {
            val bre = stack[stack.size - 4] == 1
            val veg = stack[stack.size - 3] == 2
            val gogi = stack[stack.size - 2] == 3
            val bread = stack[stack.size - 1] == 1

            if (bre && veg && gogi && bread) {
                repeat(4) { stack.pop() }
               answer++
            }
        }
    }
        return answer
    }
}