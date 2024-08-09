class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val list = mutableListOf<Int>()
        for (i in 0 until nums.size-2){
            for (j in i+1 until nums.size-1){
                for (k in j+1 until nums.size){
                    val hap = nums[i]+nums[j]+nums[k]
                    var prime = true
                    for(l in 2 until hap){
                        if(hap % l == 0){
                            prime = false
                            break
                        }
                    }
                    if(prime && hap > 1){
                        list += hap
                    }
                }
            }
        }
        
        answer = list.size
        return answer
    }
}
