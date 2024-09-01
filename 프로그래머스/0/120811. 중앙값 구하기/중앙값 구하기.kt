class Solution {
    fun solution(array: IntArray): Int {
    
        val sort = array.sorted()
        return sort[sort.size /2]
        
    }
}