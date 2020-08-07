package kot.kot3_Functional_programming

fun main() {
    val listOfNumbers = mutableListOf<Int>()

    for (i in 0..99) {
        listOfNumbers.add(i)
    }

    /** Фильтр */
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    println(listOfEvenNumbers)

    //Фильтрация по имени
//    val listOfNames = mutableListOf<String>()
//    listOfNames.add("Aaaa")
//    listOfNames.add("Bbbb")
//    listOfNames.add("Abc")
//    listOfNames.add("Fff")

    val listOfNames = listOf("Aaaa", "Bbbb", "Abc", "Fff")
    val listOfANames = listOfNames.filter { it.startsWith('A') }
    println(listOfANames)

    /** MAP - переобразование колекции в любую другую */
    val numbers = (0..100).toList()

    //Умножение елементов колекции на 2
    val doubledNumbers = numbers.map { it * 2 }
    println(doubledNumbers)

    //Переобразование в String
    val employees = numbers.map { "Employee #$it" }
    println(employees)

    //Сортировка
    val array = arrayOf(12, 2, 33, 4, 55, 6)
    val sortedArrayAsc = array.sorted()
    val sortedArrayDesc = array.sortedDescending()
    println(sortedArrayAsc)
    println(sortedArrayDesc)

    //ДЗ
    val intArrayList = mutableListOf<Int>()
    //Заполнения случайными числами от 0 до 1000
    for (i in 0 until 1000) {
        intArrayList.add((Math.random() * 1000).toInt())
    }
    //Оставить числа которые делятся без остатка на 5 или 3 - .filter { it % 5 == 0 || it % 3 == 0 }
    //Возвести в квадрат - .map { it * it }
    //Отсортировать по убыванию - .sortedDescending()
    //Преобразовать в строку  - .map { "$it" }
    val result = intArrayList.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    println(result)


}