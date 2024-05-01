class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var honor =mutableListOf<Int>()
        
        for(i in 0 until score.size){
            if(i<k){
                honor.add(score[i])
                answer= answer.plus(honor.minOf{it})
            }
            else{
                
                if(score[i]>honor.minOf{it}){
                    honor.add(score[i])
                    honor.remove(honor.minOf{it})
                   answer = answer.plus(honor.minOf{it})
                }else{
                    answer =answer.plus(honor.minOf{it})
                }
            }
        }
        
        return answer
    }
}