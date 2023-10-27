class Solution {
    fun solution(s: String): String {
        var answer = ""
        val S=s.toCharArray()
        val div= S.size/2
        if(S.size%2==1){
        answer+=S[div].toString()
         }
          else{
        answer+=S[div-1].toString()
        answer+=S[div].toString()
    }
        
        return answer
    }
}