class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        val answerSet = mutableSetOf<Int>()
    val arr = IntArray(elements.size * 2){0}

    for (j in arr.indices ){
        arr[j] = elements[j % elements.size]
    }
    for (i in 1.. elements.size){
        for (k in 0 .. elements.size){
            answerSet.add(arr.copyOfRange(k , k + i).sum())
        }
    }


    answer = answerSet.size
        
        return answer
    }
}