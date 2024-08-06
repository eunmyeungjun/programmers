class Solution {
    fun solution(s: String, n: Int): String {
        
        val S = s.map {
            
            when {
                it in 'a'..'z' -> ((it.toInt() - 'a'.toInt() + n) % 26 + 
                        'a'.toInt()).toChar()
                it in 'A'..'Z' -> ((it.toInt() - 'A'.toInt() + n) % 26 + 
                        'A'.toInt()).toChar()
                else -> it
            }
        }
        
        return S.joinToString("")
    }
}