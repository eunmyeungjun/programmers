class Solution {
    fun solution(s: String): String {
    var answer = ""
    var count =0

    for(i in s.indices){
        if(s[i]==' '){
            count=-1
        }
        answer += if(count%2==0){
            s[i].toUpperCase()
        }
        else{
            s[i].toLowerCase()
        }
        count++
    }


    return answer
}
}