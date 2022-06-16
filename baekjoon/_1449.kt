package baekjoon

fun main() = with(System.`in`.bufferedReader()) {

    val (N, L) = readLine().split(" ").map { it.toInt() }
    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
    arr.sort()

    var cnt = 0

    var range = arr[0] - 0.5 + L
    cnt++

    for (i in 0 until N) {
        if (range < arr[i]) {
            range = arr[i] - 0.5 + L
            cnt++
        }
    }
    println(cnt)
}
