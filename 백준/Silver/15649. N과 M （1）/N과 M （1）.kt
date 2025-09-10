
fun main() = with(System.`in`.bufferedReader()) {

    val sb = StringBuilder()
    val arr = mutableListOf<Int>()

    val (n, m) = readLine().split(" ").map { it.toInt() }

    val visited = BooleanArray(n+1)


    fun def( depth : Int) {

        if (depth == m) {
            sb.append(arr.joinToString(" ")).append("\n")
            return
        }
        

        for (i in 1 .. n) {
            if (visited[i] == true) {
                continue
            } else {
                visited[i] = true
                arr.add(i)

                def(depth+1)
                arr.removeLast()
                visited[i] = false
            }



        }


    }

    def(0)




    print(sb)
}