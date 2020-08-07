package kot.kot3_Functional_programming

fun main() {
    //Пример 1
    val revenueByWeak = listOf(
        listOf(1, 2, 3, 4, 5),
        listOf(1, 3, 2, 4, 5),
        listOf(1, 2, 4, 3, 5),
        listOf(2, 1, 3, 4, 5)
    )

//    val total = mutableListOf<Int>()
//
//    revenueByWeak.map {
//        for (i in it) {
//            total.add(i)
//        }
//    }
    val total = revenueByWeak.flatten()
    val average = total.average()
    println(average)

    //Пример 2 добавления елементов в MAP
    val data = mutableMapOf<String, List<Int>>()
    //data.put("file1", listOf(11, 22, 33)) аналогичен ниже
    data["file1"] = listOf(11, 22, 33)
    data["file2"] = listOf(12, 22, 32)
    data["file3"] = listOf(13, 23, 33)
    //В котлине желательно использовать immutable
    val data2 = mapOf<String, List<Int>>(
        "file1" to listOf(11, 22, 33),
        "file2" to listOf(12, -22, 32),
        "file3" to listOf(13, 23, 33)
    )
    // .flatMap - развернет наши массивы и положет все значения в 1 массив
    // .map - положит все массивы в 1 общий массив
    val average2 = data2.flatMap { it.value }.average()
    println(average2)

    //Проверить есть ли в Мапе отрицательные числа
    // it.value - возьмет колекцию значений data2
    //после чего применим к каждому елементу колекции функцию .all { it >= 0 }
    // если значение будет меньше 0 тогда оно сохранено не будет
    val average3 = data2.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(average3)


}