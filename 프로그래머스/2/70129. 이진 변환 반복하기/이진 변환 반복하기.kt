class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var count = 0
    val S = s.map { it.toString().toInt() }.toIntArray()
    var times = 1

    var size = S.filter { it != 0 }.size
    count += (S.size - size)

    while (true){
        if (size == 1){
            break
        }
        var binary =size.toString(2)
        var notZero = binary.map { it.toString().toInt() }.toIntArray()
        size = notZero.filter { it != 0 }.size
        count += notZero.size - size
        times++
    }
         answer += times
        answer += count
        return answer
    }
}