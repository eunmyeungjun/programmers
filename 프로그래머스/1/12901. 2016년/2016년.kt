class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
         val day = listOf("FRI","SAT","SUN","MON","TUE","WED","THU",)
    var plus =0
    when(a){
        1 -> plus = 0 + b
        2 -> plus = 31 + b
        3 -> plus = 60 + b
        4 -> plus = 91 + b
        5 -> plus = 121 + b
        6 -> plus = 152 + b
        7 -> plus = 182 + b
        8 -> plus = 213 + b
        9 -> plus = 244 + b
        10 -> plus = 274 + b
        11 -> plus = 305 + b
        12 -> plus = 335 + b
    }
    
    var days = plus%7
    if(days==0){
        answer += "THU"
    }else{
        answer +=day[days-1]
    }
        return answer
    }
}