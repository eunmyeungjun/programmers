class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer = 0
        
        for(i in 0 until a.size) {
            answer += a[i] * b[i]
        }
        
        return answer
    }
}