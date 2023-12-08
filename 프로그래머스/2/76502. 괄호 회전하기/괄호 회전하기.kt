import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        val stack = Stack<Char>()
    val S = s.map { it }.toMutableList()

    repeat(S.size ) {
        val temp = S[0]
        for (i in 0 until S.size -1){
            S[i] = S[i+1]
        }
        S[S.size -1] = temp

        S.forEach {
            val last =  if (stack.isNotEmpty()){
                stack.peek()
            } else {
                null
            }
            if (stack.isEmpty()){
                stack.push(it)
            }
            if (it == '[' || it == '(' || it =='{' || it ==']'|| it == ')' || it == '}'){
                if (last == '['){
                    if (it ==']'){
                        stack.pop()
                    } else stack.push(it)
                }
                if (last == '('){
                    if (it == ')'){
                        stack.pop()
                    } else stack.push(it)
                }
                if (last == '{'){
                    if (it == '}'){
                        stack.pop()
                    } else stack.push(it)
                }

            }
        }
        if (stack.isEmpty()){
            answer ++
        }
        stack.clear()
    }
        return answer
    }
}