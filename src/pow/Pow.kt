package pow

import kotlin.math.abs

class Pow {
    fun myPow(x: Double, n: Int): Double {
        var x = x
        var num:Long = abs(n.toLong())
        var result = 1.0
        while (num != 0L){
            if (num % 2 == 1.toLong()){
                result *= x
                num -= 1
            }
            x *= x
            num /= 2
        }
        return if (n < 0) 1 / result else result
    }
    fun myPow1(x: Double, n: Int): Double {
        if (n == 0) return 1.0
        if (n == 1) return x
        if (n == -1) return 1 / x
        val half = myPow(x, n / 2)
        return if (n % 2 == 0) half * half else half * half * myPow(x, n % 2)
    }
}