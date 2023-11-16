class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 1
    

    var paintStart =section[0] - 0.1
    var painted = paintStart + m
    for(i in section){
        if (i>painted){
            paintStart = i -0.1
            painted = paintStart + m
            answer++
        }
    }
        return answer
    }
}