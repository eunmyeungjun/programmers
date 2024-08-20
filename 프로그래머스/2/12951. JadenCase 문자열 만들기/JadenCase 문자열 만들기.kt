class Solution {
    fun solution(s: String): String {
        var answer = ""
         val S = s.split(" ").map { it.toLowerCase() }.toMutableList()
         
        val jaden = S.map { it.replaceFirstChar { it.toUpperCase() } }

        answer += jaden.joinToString(" ")
        return answer
    }
}