package reverseInteger

class ReverseInteger {
    fun reverse(x: Int): Int {
        var num = x
        var result = 0
        while (num != 0) {
            val pop = num % 10
            num /= 10

            if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && pop > 7)) return 0
            if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE / 10 && pop < -8)) return 0
            result = result * 10 + pop
        }
        return result
    }
}