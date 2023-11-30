class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        val hap = brown + yellow

    for (i in 3 until 4500){
        var full = false
        for (j in 3 until 4500){
            if (i >= j && i * j == hap && (i-2) * (j-2) == yellow ){
                answer += i
                answer += j
                full = true
                break
            }
        }
        if (full == true){
            break
        }
    }
        return answer
    }
}