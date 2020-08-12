package kot.kot3_Functional_programming

fun main() {
    val age = 5
    println(age.isPositive())


}

fun Int.isAgeValid() = this in 6..100
//fun isAgeValid(age: Int) = age in 6..100

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 3) return true

    for (i in 2 until this) {
        if (this % i == 0) return false
    }

    return true
}

//Своя функция WITH
inline fun <T> myWith(obj: T, operation: T.() -> Unit) {
    obj.operation()
}

//ИЛИ если хотим что нибудь возвращать
inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}



