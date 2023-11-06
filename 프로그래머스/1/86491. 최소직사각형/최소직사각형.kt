class Solution {
    fun solution(sizes: Array<IntArray>): Int {
            var answer: Int = 0
            val w = mutableListOf<Int>()
            val h = mutableListOf<Int>()

            for (i in 0 until sizes.size) {
                w.add(sizes[i][0])
                h.add(sizes[i][1])
            }
        var wbig =0
        var hbig=0
        for(j in 0 until w.size){
            if(w[j]>wbig){
                wbig =w[j]
            }
            if(h[j]>hbig){
                hbig=h[j]
            }
        }
        var biggest =0
        if(wbig>hbig){
            biggest =wbig
        }else {
            biggest =hbig
        }

        var small =1
        for(k in 0 until w.size){
            if(small<minOf(w[k],h[k])){
                small=minOf(w[k],h[k])
            }
        }
        answer=biggest *small
        return answer
    }
}