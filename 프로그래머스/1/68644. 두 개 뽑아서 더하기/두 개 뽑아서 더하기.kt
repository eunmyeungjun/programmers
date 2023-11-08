class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var set=mutableSetOf<Int>()
        for(i in numbers.indices){
        for(j in i+1 until numbers.size){
            set.add(numbers[i]+numbers[j])
        }
    }
        answer=set.sorted().toIntArray()
      return answer
    }
}