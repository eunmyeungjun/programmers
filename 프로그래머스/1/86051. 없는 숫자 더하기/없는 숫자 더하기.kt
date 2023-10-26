class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int =0
        for(i in 0 until numbers.size){
            answer +=numbers[i]
        }
        answer = 45-answer
        return answer
    }
}