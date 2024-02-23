package factorialTrailingZeroes

class FactorialTrailingZeroes {
    fun trailingZeroes(n: Int): Int {
        var count = 0
        var num = n
        while (num > 0) {
            num /= 5
            count += num
        }
        return count
    }
}