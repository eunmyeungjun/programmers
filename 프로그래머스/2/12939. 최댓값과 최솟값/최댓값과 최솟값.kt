class Solution {
    fun solution(s: String): String {
        var answer = ""
        val S =s.split(" ").map{it.toInt()}.sorted()
            answer += S[0]
          answer += " ${S[S.size-1]}"
        return answer
    }
}