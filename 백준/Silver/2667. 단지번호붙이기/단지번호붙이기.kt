fun main() = with(System.`in`.bufferedReader()) {

    val sb = StringBuilder()

    val moveX = arrayOf(1,0,-1,0)
    val moveY = arrayOf(0,1,0,-1)


    val n = readLine().toInt()
    val apt = Array(n) { IntArray(n) }
    val result = mutableListOf<Int>()

    val isVisited = Array(n){ BooleanArray(n) }

    repeat(n) {i ->
        val line = readLine()
        apt[i] = line.map { it - '0' }.toIntArray()
    }



    fun dfs(x :Int, y :Int) : Int {

        isVisited[x][y] = true
        var count = 1

        for (j in 0 until 4) {
            val nx = x + moveX[j]
            val ny = y + moveY[j]

            if (nx in 0 until n && ny in 0 until n && !isVisited[nx][ny] && apt[nx][ny] == 1) {
                count += dfs(nx,ny)
            }
        }

        return count
    }

    for (k in 0 until n ) {
        for(l in 0  until n) {
            if (apt[k][l] == 1 && !isVisited[k][l]) {
                result.add(dfs(k,l))
            }
        }
    }


    result.sort()
    sb.append(result.size).append("\n")
    result.forEach {
        sb.append(it).append("\n")
    }

    print(sb)


}