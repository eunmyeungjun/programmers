class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var todayToDate = 0
    val (ty, tm, td) = today.split(".").map { it.toInt() }
    todayToDate = (ty * 28 * 12) + (tm * 28) + td

    var termsMap = mutableMapOf<String, Int>()
    terms.forEach {
        val (kind, month) = it.split(" ")
        termsMap[kind] = month.toInt() * 28
    }

    for (i in 0 until privacies.size) {
        val (py, pm, pd, what) = privacies[i].split(".", " ")
        val pDays = (py.toInt() * 28 * 12) + (pm.toInt() * 28) + pd.toInt()

        if (todayToDate >= pDays + termsMap[what]!!) {
            answer += i + 1
        }
    }
        return answer
    }
}