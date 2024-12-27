class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
    val map = mutableMapOf<String,Int>()
    val rankMap = mutableMapOf<Int, String>()


    for (i in 0 until players.size) {
        map[players[i]] = i
        rankMap[i] = players[i]
    }

    callings.forEach {winner ->
        val winnerRank = map[winner]!!
        val loser = rankMap[winnerRank - 1]!!

        map[winner] = winnerRank - 1
        map[loser] = winnerRank

        rankMap[winnerRank - 1] = winner
        rankMap[winnerRank] = loser

    }
    return rankMap.entries.sortedBy { it.key }.map { it.value }.toTypedArray()
    }
}