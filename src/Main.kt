
import pow.Pow

fun main() {
    val pow = Pow()
    println(pow.myPow(2.0, 10)) // 1024.0
    println(pow.myPow(2.1, 3)) // 9.261
    println(pow.myPow(2.0, -2)) // 0.25
    println(pow.myPow(2.0, 0)) // 1.0
    println(pow.myPow(2.0, 1)) // 2.0
    println(pow.myPow(2.0, -1)) // 0.5
    println(pow.myPow(2.0, 2)) // 4.0
    println(pow.myPow(2.0, 3)) // 8.0

}