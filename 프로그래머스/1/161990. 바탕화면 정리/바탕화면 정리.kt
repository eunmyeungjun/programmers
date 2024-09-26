class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer = intArrayOf()
    var maxX = 0
    var minX = 100
    var maxY = 0
    var minY = 100
    for (i in 0 until wallpaper.size){
        for (j in 0 until wallpaper[i].length){
            if (wallpaper[i][j] =='#'){
               if (i >= maxX){
                   maxX = i
               }
                if (i <= minX){
                    minX= i
               }
                if (j >= maxY){
                    maxY = j
                }
                if (j <= minY){
                    minY = j
                }
            }
        }
    }
    
    answer += minX
    answer += minY
    answer += maxX+1
    answer += maxY+1
        return answer
    }
}