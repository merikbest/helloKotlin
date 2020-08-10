package kot.kot3_Functional_programming

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 400)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filterNot { it.value.any { it < 0 } }
    val averageWeak = validData.flatMap { it.value }.average()
    println("Average for weak: $averageWeak")

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.max()
    val min = listOfSum.min()
    val averageMonth = listOfSum.average()

    val maxMonths = validData.filter { it.value.sum() == max }.keys
    val minMonths = validData.filter { it.value.sum() == min }.keys

    println("Average earnings for month: $averageMonth")
    println("Max earnings for month: $averageMonth")
    print("Max earnings for each month: ")
    for (maxMonth in maxMonths) {
        println("$maxMonth ")
    }

    print("Min earnings for each month: ")
    for (minMonth in minMonths) {
        println("$minMonth ")
    }

    val invalidData = data.filterNot { it.value.any { it < 0 } }
    val errorMonth = invalidData.keys
    print("Errors for each month: ")
    for (month in errorMonth) {
        print("$month ")
    }
}