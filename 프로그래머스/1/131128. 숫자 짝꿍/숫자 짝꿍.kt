class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        var result = mutableListOf<Int>()
    var countX = MutableList(10){0}
    var countY = MutableList(10){0}
    val x = X.map { it.toString().toInt() }.toMutableList()
    var y = Y.map { it.toString().toInt() }.toMutableList()

    for(i in x){
        countX[i]++
    }
    for (j in y){
        countY[j]++
    }
    for(k in 9 downTo 0){
        if (countX[k] > 0 && countY[k] > 0){
            repeat(minOf(countX[k],countY[k])){
                result.add(k)
            }
        }
    }
    if (result.isEmpty()){
        answer ="-1"
    }else if(result[0]==0){
        answer  = "0"
    }else{
        answer +=result.joinToString("")
    }
        return answer
    }
}