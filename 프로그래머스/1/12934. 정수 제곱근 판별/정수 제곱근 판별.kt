class Solution {
    fun solution(n: Long): Long {
        var answer: Long = -1
        for(i in 0..n){
            if(i*i==n){
                answer = (i+1)*(i+1)
                break
                
            }
        }
        return answer
    }
}