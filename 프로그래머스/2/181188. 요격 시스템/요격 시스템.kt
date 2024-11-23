class Solution {
    fun solution(targets: Array<IntArray>): Int {
        
        var answer = 0        
        var missileEnd = 0
        targets.sortBy { it[0] }.apply {
        
        for (i in targets) {
        val start = i[0]
        val end = i[1]

        if (start >= missileEnd) {
            missileEnd = end
            answer++
        } else {
               missileEnd = minOf(missileEnd, end)
          }
        }
    }
        
        
        return answer
    }
}