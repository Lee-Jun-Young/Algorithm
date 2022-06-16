package programmers

import java.util.*

fun main() {

    val number = "4177252841"
    val k = 4

    println(solution(number, k))

}

fun solution(number: String, k: Int): String {

    val stack = Stack<Char>()
    var num = k

    number.forEach { c ->
        while(stack.isNotEmpty() && stack.peek() < c && num > 0){
            stack.pop()
            num--
        }
        stack.push(c)
    }

    for(i in 0 until num){
        stack.pop()
    }

    return stack.toArray().joinToString("")
}