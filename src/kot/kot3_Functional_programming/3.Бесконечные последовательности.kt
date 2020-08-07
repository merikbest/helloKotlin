package kot.kot3_Functional_programming

import java.util.*

fun main() {
    /** Методы take и .drop */
    val array = (1..1000).toList()
    val employees = array.map { "Employee #$it" }
    // .take(30) - взять первые 30 значений или .takeLast(30)
    val first30 = employees.take(30)
    println(first30)
    // .drop(30) - удалить первые 30 значений или .dropLast(30)
    val drop30 = employees.drop(30)
    println(drop30)

    /** Бесконечные последовательности */
    //Ленивая инициализация - инициализируется елемент если он используется где-то в коде
    //Только при вызове циклом for инициализируются объекты в массиве array2
    val array2 = generateSequence(0) { it + 2 }
    val evenList = array2.take(10)
    for (i in evenList) {
        print("$i ")
    }
    println()

    //Алфавит
    val array3 = generateSequence('A') { it + 1 }
    val alph = array3.take(26)
    for (c in alph) {
        print("$c ")
    }
    println()

    //случайные 10 чисел
    val array4 = generateSequence { (Math.random() * 100).toInt() }
    val list100 = array4.take(10).sorted()
    for (i in list100) {
        print("$i ")
    }
    println()

    //ДЗ
    val array5 = generateSequence("Employee #1") {
        val index = it.substring(10).toInt()
        "Employee #${index + 1}"
    }
    val employees2 = array5.take(100)
    for (i in employees2) {
        print(i)
    }
}

