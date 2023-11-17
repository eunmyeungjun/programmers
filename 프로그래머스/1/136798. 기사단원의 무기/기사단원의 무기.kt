import kotlin.math.*
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        
        for(i in 1 .. number){
            var count = 0
            val root = sqrt(i.toDouble()).toInt()
            for(j in 1 .. root){
                if(j *j == i){
                    count += 1
                }else if(i % j ==0){
                    count += 2
                }
            }
            
            if(count > limit){
                answer += power
            }else{
                answer += count
            }
        }
         
        return answer
    }
}