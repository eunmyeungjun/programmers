class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n - lost.size
        
        var lostStudent =lost.toMutableList().sorted()
        var remain = reserve.toMutableList().sorted()
        for(i in lostStudent){
        if (i in remain){
            
            remain = (remain - i ).sorted().toMutableList()
            lostStudent = (lostStudent-i).sorted().toMutableList()
            answer ++
            }
        } 
        
        for(j in lostStudent){    
        if (answer == n) {
            return answer
        }
        
        if (j-1 in remain) {
            remain = (remain -(j-1)).sorted().toMutableList()
            lostStudent =(lostStudent -(j-1)).sorted().toMutableList()
            answer++
        } else if(j+1 in remain){
            remain = (remain - (j+1)).sorted().toMutableList()
            lostStudent = (lostStudent - (j+1)).sorted().toMutableList()
            answer++
            }
        }
        return answer
    }
}