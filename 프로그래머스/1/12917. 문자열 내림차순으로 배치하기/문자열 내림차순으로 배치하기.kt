class Solution {
    fun solution(s: String): String {
        var answer = ""
        val S=s.toList().sortedDescending()
        answer =S.joinToString("")
        return answer
    }
}