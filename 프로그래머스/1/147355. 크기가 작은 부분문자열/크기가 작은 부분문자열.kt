class Solution {
    fun solution(t: String, p: String): Int {
    var answer: Int = 0

    for (i in 0 until t.length - p.length + 1) {
        val sub = t.substring(i, i + p.length)
        if (sub.toLong() <= p.toLong()) {
            answer++
        }
    }
    
    return answer
}
}