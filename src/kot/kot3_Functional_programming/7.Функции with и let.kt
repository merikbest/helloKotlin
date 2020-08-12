package kot.kot3_Functional_programming

var name: String? = null

val list1: MutableList<Int>? = mutableListOf()

fun main() {
    //Проверка на null в Kotlin

    //LET
    name?.let {
        if (it.length > 5) {
            println("asdew")
        }
    }

    //WITH
    val list = mutableListOf<Int>()

    with(list) {
        for (i in 0 until 1000) {
            add((Math.random() * 100).toInt())
            //или this.add((Math.random() * 100).toInt())
        }
        println(sum())
        println(average())
        println(min())
        println(max())
        println(first())
        println(last())
    }

    //Заполнить нулабельную коллекцию 1000 случайными числами
    //вывести только 100 четных чисел
    list1?.let {
        with(list1) {
            for (i in 0 until 1000) {
                add((Math.random() * 100).toInt())
            }

            val result = filter { it % 2 == 0 }.take(100)

            for (i in result) {
                println(i)
            }
        }
    }



}