class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var max = 0L
        for(i in 1 .. count) {
            max += (price * i).toLong()
        }
        
    
        if(money >= max ) return 0 else return max - money.toLong()
    }
}