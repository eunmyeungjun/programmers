class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var N = n
        
        while(N != 0){
            answer += N % 10
            N = N /10
        }
        println(answer)
        return answer
    }
}