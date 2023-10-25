class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        val array =arr.sorted().toIntArray()
        var element=mutableListOf<Int>()
        for(i in 0 until array.size){
            if(array[i]%divisor==0){
                element.add(array[i])
            }
        }
        if(element.isEmpty()){
            element.add(-1)
        }
        answer=element.toIntArray()
        return answer
    }
}