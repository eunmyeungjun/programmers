class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var count =0
        val list=seoul.toList()
        for(i in 0 until list.size){
            if(list[i]=="Kim"){
                count=i
                break
            }
        }
        answer="김서방은 ${count}에 있다"
        return answer
    }
}