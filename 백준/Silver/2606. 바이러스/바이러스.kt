


fun main() = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()
    val m = readLine().toInt()


    val com = Array(n +1) {IntArray(n +1) }
    val isVisited = BooleanArray(n+1)


    repeat(m) {
        val(a , b) = readLine().split(" ").map{ it.toInt() }
        com[a][b] = 1
        com[b][a] = 1
    }



    fun bfs(start : Int) : Int {
        val que = ArrayDeque<Int>()
        var count = 0

        que.add(start)
        isVisited[start] = true

        while (que.isNotEmpty()) {
            val current = que.removeFirst()
            for (i in 1..n) {
                if (!isVisited[i] && com[current][i] == 1) {
                    isVisited[i] = true
                    que.add(i)
                    count++
                }
            }
        }

        return count

    }

    print(bfs(1))

}

