class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        
        if(num==1){
            answer=0
        }
        var n:Long =num.toLong()
        var count=0
        while(n != 1.toLong()){
            if(count>500){
                count= -1
                break
            }
            if(n%2==0.toLong()){
               n=(n/2).toLong()
                count++
            }
            else{
                n= (n*3+1).toLong()
                count++
            }
        }
        answer =count
        return answer
    }
}