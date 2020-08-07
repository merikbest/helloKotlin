package kot.kot3_Functional_programming

import kotlin.math.pow

fun main() {
    val sum1 = { a: Int, b: Int -> a + b }
    println(sum1(2, 3))
    //ИЛИ
    val sum2: (Int, Int) -> Int = { a, b -> a + b }

    val square1 = { a: Double -> a.pow(2) }
    println(square1(5.0))
    //ИЛИ
    val square2: (Int) -> Int = { a -> a * a }
    println(square2(5))
    //ИЛИ
    val square3: (Int) -> Int = { it * it } //вместо a * a, только если 1 параметр
    println(square3(5))

    //Периметр треугольника
    val triangle: (Int, Int, Int) -> Int = { a, b, c -> a + b + c }
    println(triangle(3, 3, 3))
    //Вывод строки
    val helloString: (String) -> String = { "Hello $it" }
    println(helloString("Bob"))
    //Сортировка массива по убыванию
    val sortArray: (Array<Int>) -> List<Int> = { array -> array.sortedDescending() }
    println(sortArray(arrayOf(1, 2, 3, 4, 5)))
}