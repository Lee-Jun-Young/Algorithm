package programmers

fun main() {

    println(solution(6, intArrayOf(7, 10)))

}

fun solution(n: Int, times: IntArray): Long {
    var answer: Long = 0

    var left: Long = 0
    var right: Long = times.maxOrNull()!! * n.toLong()

    while (left <= right) {
        val mid = (left + right) / 2
        var sum: Long = 0

        times.forEach {
            sum += mid / it
        }

        if (sum < n) {
            left = mid + 1
        } else {
            right = mid - 1
            answer = mid
        }
    }

    return answer
}