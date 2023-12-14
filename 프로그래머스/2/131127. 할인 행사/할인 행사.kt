class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        val wantNum = mutableMapOf<String, Int>()

    for (i in 0 until want.size){
        wantNum += (want[i] to number[i])
    }
    var count = 0

    for (j in 0 until discount.size){
        val check  = wantNum.toMutableMap()
        count = 0

        for (k in j until j + 10){
            if (k < discount.size && discount[k] in check && check[discount[k]]!! > 0 ){
                check[discount[k]] = check[discount[k]]!! - 1
            }
        }
        for (l in want){
            if (check[l] == 0){
                count++
            }
        }

        if (count == want.size){
            answer++
        }
    }
        return answer
    }
}