class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        s.forEach {
        var num = it.toInt()
        var count = 0
        while (count != index){
            count++
            if (num + 1 >'z'.toInt()){
                num = 'a'.toInt()
            }else{
                num++
            }
            while (skip.contains(num.toChar())){
                num++
                if (num > 'z'.toInt()){
                    num = 'a'.toInt()
                }
            }
        }
        answer += num.toChar().toString()
    }
        return answer
    }
}