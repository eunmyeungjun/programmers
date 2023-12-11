class Solution {
    fun solution(citations: IntArray): Int {
        var answer = citations.size
            val citation = citations.sortedDescending()

    for (i in 0 until citations.size){
      if (citation[i] < i+1){
          answer = i
          break
      }

    }
        return answer
    }
}