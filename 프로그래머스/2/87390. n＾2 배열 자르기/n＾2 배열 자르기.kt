class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer: IntArray = intArrayOf() 
        val result = (left..right).map {
            val x = it / n
            val y = it % n
            if (x >= y){
             (x+1)
            }else {
                (y+1)
            }
            }
            for(i in 0 until result.size){
                answer += result[i].toInt()
            }
        
        return answer
    }
}