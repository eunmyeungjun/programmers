class Solution {
    fun solution(n: Int): Int {
        var answer = 0 
        val mod = 1234567
        val arr = IntArray(n+1){0}
        arr[0] = 0 ; arr[1] = 1 ;
        for (i in 2..n){
         arr[i] = (arr[i-2] % mod) + (arr[i - 1] % mod)
         }
        answer = arr[n] % mod
        return answer
    }
}