
import java.util.Deque
import java.util.LinkedList



class Solution {
    fun solution(stones: IntArray, k: Int): Int {

        
    var answer = Int.MAX_VALUE
    val window : Deque<Int> = LinkedList()

    for (i in stones.indices) {

        if (!window.isEmpty() && window.first() == i - k) {
            window.removeFirst()
        }

        while (!window.isEmpty() && stones[window.last()] <= stones[i]) {
            window.removeLast()
        }
        
        window.addLast(i)
        
        if (i >= k - 1) {
            answer = minOf(answer, stones[window.first()])
        }
    }
        return answer
    }
}