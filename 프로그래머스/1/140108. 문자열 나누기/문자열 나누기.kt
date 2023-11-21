class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        
    var target =""
    var x = 0
    var notX = 0

    for (i in 0 until s.length){
        if (target == ""){
            target =s[i].toString()
        }
        if (target == s[i].toString()){
            x++
        }else{
            notX++
        }
        if (x == notX){
            answer ++
            x = 0
            notX = 0
            target =""
        }
    }
    
    if (target != ""){
        answer++
    }
        return answer
    }
}