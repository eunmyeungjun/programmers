class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var N=n
        var remain =0
        var coke =0
        while(true){
            if(N<a){
                break
            }
            answer += (N/a)*b
            remain = N%a
            N=((N/a)*b)+remain
        }
        return answer
    }
}