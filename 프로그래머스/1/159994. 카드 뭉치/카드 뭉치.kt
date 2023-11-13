class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        var oneCount = 0
        var twoCount = 0
        
        goal.forEach{
            if(it == cards1[oneCount]){
                if(oneCount < cards1.size-1){
                    oneCount++
                }
            }
           else if(it == cards2[twoCount]){
                if(twoCount < cards2.size-1){
                    twoCount++
                }
            }
            else{
                answer ="No"
            }
        }
        return answer
    }
}