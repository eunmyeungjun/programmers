class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val map = Array(park.size) { park[it] }
        var x = 0
        var y = 0

        for (i in map.indices) {
            for (j in map[0].indices) {
                if (map[i][j] == 'S') {
                    x = j
                    y = i
                    break
                }
            }
        }
        for (s in routes) {
            val array = s.split(" ")
            val dir = array[0]
            val count = array[1].toInt()

            for (k in 0 until count) {
                when (dir) {
                    "N" -> {
                        if (y <= 0 || map[y - 1][x] == 'X') {
                            y += k
                            break
                        }
                        y--
                    }
                    "S" -> {
                        if (y >= map.size - 1 || map[y + 1][x] == 'X') {
                            y -= k
                            break
                        }
                        y++
                    }
                    "E" -> {
                        if (x >= map[0].length - 1 || map[y][x + 1] == 'X') {
                            x -= k
                            break
                        }
                        x++
                    }
                    "W" -> {
                        if (x <= 0 || map[y][x - 1] == 'X') {
                            x += k
                            break
                        }
                        x--
                    }
                }
            }
        }
        answer += y
        answer += x
        return answer
    }
}