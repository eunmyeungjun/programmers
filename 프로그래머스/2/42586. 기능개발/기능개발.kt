class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
                var array = arrayListOf<Int>()
        var days = arrayListOf<Int>()

        array = progresses.toCollection(ArrayList())

        for (i in 0 until array.size) {
            var day = 0
            while (array[i] < 100) {
                array[i] += speeds[i]
                day += 1
            }
            days.add(day)
        }
        while (days.isNotEmpty()) {
            val release = days.removeAt(0)
            var count = 1
            while (days.isNotEmpty() && days.first() <= release) {
                days.removeAt(0)
                count += 1
            }
            answer = answer.plus(count)
        }
        return answer
    }
}