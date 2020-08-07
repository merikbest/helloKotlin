package kot.kot2_Syntax

fun main() {
    println(max2(3, 4))
    println(crop("Hello World"))
    println(sum(5, 6, 7))
    println(sort(mutableListOf(5, 673, 24, 4, 588, 212, 1, 0)))
    println(sort(arrayOf(5, 673, 24, 4, 588, 212, 1, 0)))
    println(sort(5, 673, 24, 4, 588, 212, 1, 0))

}

fun max1(a: Int, b: Int): Int { //где : Int возв. тип
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

//ИЛИ
fun max2(a: Int, b: Int): Int = if (a > b) a else b

//void method
fun crop(string: String) = string.substring(0, Math.min(5, string.length))

//Аргументы переменной длины
fun sum(vararg numbers: Int): Int {
    var result: Int = 0

    for (i in numbers) {
        result += i
    }

    return result
}

//Сортировка пузырьком
fun sort(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}
// перегрузка сортировки
//масив
fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
//для аргументов переменной длинны
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())