class Solution {
    fun solution(arr: IntArray): Int {
        for (i in 0 until arr.size - 1) {
            arr[i + 1] = (arr[i] * arr[i + 1]) / gongYack(arr[i], arr[i + 1])
        }
       return arr[arr.size - 1]
    }
     fun gongYack(a: Int, b: Int): Int {
        var remain = 0
        var A = a
        var B = b
        while (B != 0) {
            remain = A % B
            A = B
            B = remain
        }

        return A
    }
}