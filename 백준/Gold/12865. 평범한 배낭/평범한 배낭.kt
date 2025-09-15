import kotlin.math.max



fun main() = with(System.`in`.bufferedReader()) {


    val (n,k) = readLine().split(" ").map{ it.toInt() }

    var sb = StringBuilder()
    val weightArr = IntArray(n+1)
    val valArr = IntArray(n+1)

    repeat(n) {
        val (w,v) = readLine().split(" ").map { it.toInt() }
        weightArr[it+1] = w
        valArr[it+1] = v
    }

    val dp = Array(n+1) { IntArray(k+1){-1} }



    fun def(index: Int, weight: Int): Int {
        if (weight > k) return Int.MIN_VALUE
        if (index > n) return 0  
        if (dp[index][weight] != -1) return dp[index][weight]

        var result = def(index+1, weight)
        if (weight + weightArr[index] <= k) {
            result = max(result, def(index+1, weight + weightArr[index]) + valArr[index])
        }

        dp[index][weight] = result
        return result
    }


    sb.append( def(1,0))

    print(sb)
    
}
