class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        var answer: Int = 0
        return calculateMinRooms(book_time)
    }
}


fun calculateMinRooms(book_time: Array<Array<String>>) : Int {
    val sortedBookings = sortedBook(book_time)
    val checkRoom = mutableListOf<MutableList<Int>>()

    sortedBookings.forEach { (startTime,endTime) ->
        assignRooms(checkRoom,startTime,endTime)
    }

    return checkRoom.size
}

fun assignRooms(checkRoom: MutableList<MutableList<Int>> , startTime : Int, endTime : Int) {

    if (checkRoom.isEmpty()) {
        checkRoom.add(mutableListOf(startTime,endTime))
        return
    }
    var isRoomAdd = false
    for (room in checkRoom) {
        if (room.last() <= startTime) {
            room.add(endTime)
            isRoomAdd = true
            break
        }
    }

    if (!isRoomAdd) checkRoom.add(mutableListOf(startTime,endTime))

}


fun sortedBook(book_time : Array<Array<String>>) : List<Pair<Int, Int>> {
    return book_time.map {
        val startTime = timeToMin(it[0])
        val endTime = timeToMin(it[1]) + 10
        startTime to endTime
    }.sortedBy { it.first }

}

fun timeToMin(time : String) : Int {
    val (hour,min) = time.split(":").map { it.toInt() }
    return (hour * 60) + min
}