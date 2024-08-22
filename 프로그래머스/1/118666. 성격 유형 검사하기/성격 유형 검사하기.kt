class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
         var score = mutableMapOf<String,Int>(
         "R" to 0, "T" to 0 , "C" to 0 , "F" to 0 ,
         "J" to 0, "M" to 0 , "A" to 0 , "N" to 0
     )
         
    for (i in 0 until choices.size) {
        when (choices[i]) {
            1 -> score["${survey[i][0]}"] = (score["${survey[i][0]}"]!! + 3)
            2 -> score["${survey[i][0]}"] = (score["${survey[i][0]}"]!! + 2)
            3 -> score["${survey[i][0]}"] = (score["${survey[i][0]}"]!! + 1)
            4 -> score["${survey[i][0]}"] = (score["${survey[i][0]}"]!!+  0)
            5 -> score["${survey[i][1]}"] = (score["${survey[i][1]}"]!! + 1)
            6 -> score["${survey[i][1]}"] = (score["${survey[i][1]}"]!! + 2)
            7 -> score["${survey[i][1]}"] = (score["${survey[i][1]}"]!! + 3)
        }
    }
    if (score["R"]!! >= score["T"]!!) answer += "R"
        else  answer += "T"
       if ( score["C"]!! >= score["F"]!!) answer += "C"
        else answer += "F"
       if ( score["J"]!! >= score["M"]!!) answer += "J"
      else   answer += "M"
       if ( score["A"]!! >= score["N"]!!)  answer += "A"
       else  answer += "N"
        return answer
    }
}