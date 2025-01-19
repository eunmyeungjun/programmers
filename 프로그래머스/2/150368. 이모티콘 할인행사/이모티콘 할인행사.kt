class Solution {
    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
            var answer : IntArray = intArrayOf(0,0)
    val rates = intArrayOf(10, 20, 30, 40)
    val sales = mutableListOf<Int>()


    fun dfs(depth: Int) {
        if (depth == emoticons.size) {
            var subCount = 0
            var totalPrice = 0

            users.forEach {(rate,price) ->
                var userTotal = 0

                sales.forEachIndexed {index,discount ->
                    if (rate <= discount) {
                        userTotal += emoticons[index] * (100 - discount) / 100
                    }
                }

                if (userTotal >= price) {
                    subCount++
                } else {
                    totalPrice += userTotal
                }
            }

            if (answer[0] < subCount) {
                answer[0] = subCount
                answer[1] = totalPrice
            } else if (answer[0] == subCount && answer[1] < totalPrice ) {
                answer[1] = totalPrice
            }
            return
        }

        for (rate in rates) {
            sales.add(rate)
            dfs(depth+1)
            sales.removeLast()

        }
    }

    dfs(0)

        return answer
    }
}