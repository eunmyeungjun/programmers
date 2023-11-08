class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size, {0})

        for(i in commands.indices){
            var cut = array.sliceArray(commands[i][0]-1..commands[i][1]-1)
            cut.sort()
            answer[i] = cut[commands[i][2]-1]
        }
        return answer
    }
}