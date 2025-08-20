
fun main() = with(System.`in`.bufferedReader()){




    val (n , m ) = readLine().split(" ").map{ it.toInt() }
    val arr = readLine().split(" ").map { it.toInt() }.toList()

    var answer = 0

    for (i in 0 until arr.size) {
        var prefix = 0
        prefix += arr[i]

        if (prefix == m) {
            answer++
            continue
        } else if(prefix > m) {
            continue
        }

        for(j in i+1 until arr.size ) {
            prefix += arr[j]
            if (prefix == m) {
                answer++
                continue
            } else if(prefix > m) {
                continue
            }
        }

    }



    print(answer)


}