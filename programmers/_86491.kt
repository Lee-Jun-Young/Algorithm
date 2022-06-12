package programmers

class _86491 {

    fun solution(sizes: Array<IntArray>): Int {
        // max : 가로, 세로 길이 중 길이가 긴 것중에 최대 값
        var max = 0
        // min : 가로, 세로 길이 중 길이가 짧은 것 중에 최대 값
        var min = 0

        sizes.forEach{
            max = maxOf(max, it[0], it[1])
            if(it[0] < it[1]){
                min = Math.max(min, it[0])
            }else{
                min = Math.max(min, it[1])
            }
        }

        return max * min
    }
}