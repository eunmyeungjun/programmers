class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var list= mutableListOf<Int>()

        for(i in 1 until food.size){
            val j =food[i]/2
            repeat(j){
                list.add(i)
            }
        }
        val rev = list.reversed()
        list.add(0)

        answer = (list + rev).joinToString("")
        return answer
    }
}