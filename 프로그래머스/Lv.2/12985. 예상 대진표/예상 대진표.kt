class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var winnerA = a
        var winnerB = b

        while (true){
            if ( winnerA == winnerB ){
                break
            }
            if (winnerA % 2 == 0){
                winnerA /= 2
               } else {
                winnerA = (winnerA/2) + 1
            }
             if (winnerB % 2 == 0){
                winnerB /= 2
                } else {
                   winnerB = (winnerB/2) + 1
                }
                answer++
            }
         return answer
        }
}