class Solution {
    fun solution(t: String, p: String): Int {
    var answer: Int = 0
    var count =0    
        for (i in 0 until t.length - p.length + 1) {
        val cut = t.substring(i, i + p.length)
        if (cut.toLong() <= p.toLong()) {
            count++
        }
    }
    answer = count
    return answer
}
}