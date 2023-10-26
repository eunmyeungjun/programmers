class Solution {
    fun solution(phone_number: String): String {
        var answer = ""     
        val num=phone_number.toMutableList()

        for(i in 0 until num.size){
            if(i< num.size-4){
            num[i]= '*'
        }
    }
        answer=num.joinToString("")
        return answer
    }
}