class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        var min = Int.MAX_VALUE
        var list =arr.toList()
        
        if(arr.size == 1 ){
            return intArrayOf(-1)
        }
        
        for(i in 0 until arr.size){
            if(arr[i]<min){
                min=arr[i]
            }
        }
        val answerList =list - min

        answer=answerList.toIntArray()
        return answer
    }
}