class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer = IntArray(id_list.size){0}
    val reportSet = report.toMutableSet()
    val reportScore = mutableMapOf<String,Int>()
    for (i in id_list){
        reportScore[i] = 0
    }

    for (j in reportSet){
        val  reported = j.split(" ")[1]
        reportScore[reported] = reportScore[reported]!! +1
    }
    val badUser = reportScore.filter { it.value >= k }.keys

    for (k in reportSet){
        val reporter = k.split(" ")[0]
        val reported2 = k.split(" ")[1]

        if (reported2 in badUser){
           val index = id_list.indexOf(reporter)
            answer[index]++
        }
    }
        return answer
    }
}