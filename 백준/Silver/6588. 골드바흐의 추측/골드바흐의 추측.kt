fun main() = with(System.`in`.bufferedReader()) {

    val isPrime = BooleanArray(1000001){true}
    isPrime[0] = false
    isPrime[1] = false

    var i = 2
    while (i * i <= 1000000) {
        if (isPrime[i]) {
            for (j in i * i .. 1000000 step i) {
                isPrime[j] = false
            }
        }
        i++
    }

    while (true) {
        val n = readLine().toInt()
        if (n == 0) break
        var found = false
        for (a in 2..n / 2) {
            val b = n - a
            if (isPrime[a] && isPrime[b]) {
                println("$n = $a + $b")
                found = true
                break
            }
        }

        if (!found) {
            println("Goldbach's conjecture is wrong.")
        }
    }

}