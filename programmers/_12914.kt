package programmers

fun main() {

    println(solution(4))

}


fun solution(n: Int): Long{

    val dp = LongArray(2001)

    dp[0] = 1
    dp[1] = 2

    for(i in 2 ..n ){
        dp[i] = (dp[i-2] + dp[i-1]) % 1234567
    }

    return dp[n-1]
}