class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val one = arrayOf(1,2,3,4,5)
    val two = arrayOf(2,1,2,3,2,4,2,5)
    val three = arrayOf(3,3,1,1,2,2,4,4,5,5)

    var oneScore = 0
    var twoScore = 0
    var threeScore = 0

    for (i in 0 until answers.size){
        if(answers[i] == one[i%one.size]){
            oneScore++
        }
        if(answers[i] == two[i%two.size]){
            twoScore++
        }
        if(answers[i] == three[i % three.size]){
            threeScore++
        }
    }
    if (oneScore >= twoScore && oneScore >= threeScore){
        answer += 1
    }
    if (twoScore >= oneScore && twoScore >= threeScore){
        answer += 2
    }
    if (threeScore >= oneScore && threeScore >= twoScore){
        answer += 3
    }
        return answer
    }
}