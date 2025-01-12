class Solution {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        
    
    var arr = Array (rows) {Array (columns) {0}}
    var num = 1

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            arr[i][j] = num
            num++
        }
    }
    val answer = mutableListOf<Int>()

    for (k in queries) {
        val x1 = k[0] - 1
        val y1 = k[1] - 1
        val x2 = k[2] - 1
        val y2 = k[3] - 1

        var min = Int.MAX_VALUE
        var prevValue = arr[x1+1][y1]

        for (col in y1..y2) {
            val temp = arr[x1][col]
            arr[x1][col] = prevValue
            prevValue = temp
            min = minOf(min, prevValue)
        }

        for (row in (x1 + 1)..x2) {
            val temp = arr[row][y2]
            arr[row][y2] = prevValue
            prevValue = temp
            min = minOf(min, prevValue)
        }

        for (col in (y2 - 1) downTo y1) {
            val temp = arr[x2][col]
            arr[x2][col] = prevValue
            prevValue = temp
            min = minOf(min, prevValue)
        }

        for (row in (x2 - 1) downTo x1) {
            val temp = arr[row][y1]
            arr[row][y1] = prevValue
            prevValue = temp
            min = minOf(min, prevValue)
        }

        answer.add(min)

    }
        
        return answer.toIntArray()
    }
}