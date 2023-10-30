class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
    var answer: Long = -1
    var howMuch:Long = 0
    for(i in 1 .. count){
        howMuch += price * i
    }

    if(money >= howMuch){
        answer=0
    }else{
       answer= howMuch-money
    }

    return answer
}
}