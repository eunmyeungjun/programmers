
fun main() = with(System.`in`.bufferedReader()) {

    val (n,m) = readLine().split(" ").map { it.toInt() }
    val trees = readLine().split(" ").map { it.toInt() }

    var answer = 0
    var start = 0
    var end = trees.max()


    while (start <= end) {
        var hap = 0L
        var over = false
        var mid = (start + end) / 2

        for (tree in trees) {
            val cut = tree - mid

            if (cut >0) hap += cut.toLong()
            if (hap >= m) {
                over = true
                break
            }
        }

        if (over) {
            answer = mid
            start = mid +1

        } else {
            end = mid -1
        }

        
    }
    
    println(answer)



}