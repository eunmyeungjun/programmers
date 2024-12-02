class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
            var answer = 0
    var checkRoom = mutableListOf<MutableList<Int>>()
    
    val bookTimeSort = book_time.toList().sortedBy { it.first() }
    bookTimeSort.forEach {
        val startTime = it.first().split(":")[0].toInt() * 60 + it.first().split(":")[1].toInt()
        val endTime = it.last().split(":")[0].toInt() * 60 + it.last().split(":")[1].toInt() + 10
        val roomTime = mutableListOf(startTime,endTime)

        if(checkRoom.isEmpty())  checkRoom.add(roomTime)

        else {
            var addCheck = true
            for(i in 0 until  checkRoom.size){
                if(checkRoom[i].last() <= startTime) {
                    addCheck = false
                    checkRoom[i].add(endTime)
                    break
                }
            }
            
            if(addCheck) checkRoom.add(roomTime)

        }
        answer = checkRoom.size
    }
        
        return answer
    }
}