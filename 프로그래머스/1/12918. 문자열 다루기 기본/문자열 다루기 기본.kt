class Solution {
    fun solution(s: String): Boolean {
    var answer = false
    val S=s.toList()
    if(S.size==4 ||S.size ==6){
        if(S.all{it.isDigit()}){
            answer = true
        }
    }
    return answer
}
}
