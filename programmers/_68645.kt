package programmers

fun main() {
    println(solution68645(4))
}

fun solution68645(n: Int): IntArray {
    var answer: IntArray = intArrayOf()
    val arr = Array(n) { IntArray(n) }
    val max = n * (n + 1) / 2
    var top = 0
    var left = 0
    var bottom = n - 1
    var right = n - 1
    var value = 1

    while(value <= max){
        for(i in top..bottom){
            if(value > max) break
            arr[i][left] = value++
        }
        if(value > max) break
        top++
        left++

        for(j in left..right){
            if(value > max) break
            arr[bottom][j] = value++
        }
        if(value > max) break
        bottom--
        right--

        var temp = right
        for(k in bottom downTo top){
            if(value > max) break
            arr[k][temp--] = value++
        }
        top++
        right--
    }

    answer = IntArray(max)
    var index = 0
    for (i in 0 until n) {
        for (j in 0..i) {
            answer[index++] = arr[i][j]
        }
    }

    return answer
}