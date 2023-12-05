class Solution {
fun solution(n: Int): Long {
    var answer: Long = 0
    val mod = 1234567
    val arr = LongArray(2003){0}
    arr[0] = 0
    arr[1] = 1
    arr[2] = 2
    for (i in 3..n){
        arr[i] = (arr[i-2] + arr[i-1]) % mod
    }

    answer = arr[n]   
        return answer
    }
}