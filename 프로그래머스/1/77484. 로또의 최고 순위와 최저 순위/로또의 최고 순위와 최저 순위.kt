class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var count = 0
        val zero = lottos.count { it == 0 }
        
    for(i in win_nums){
        if (i in lottos){
            count++
        }
    }
    

    when(zero + count){
        6 -> answer += 1
        5 -> answer += 2
        4 -> answer += 3
        3 -> answer += 4
        2 -> answer += 5
        else -> answer += 6
    }
    when (count){
        6 -> answer += 1
        5 -> answer += 2
        4 -> answer += 3
        3 -> answer += 4
        2 -> answer += 5
        else -> answer += 6
    }
        
        return answer
    }
}