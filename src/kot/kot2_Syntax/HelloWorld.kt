package kot.kot2_Syntax

//Kotlin
object HelloWorld {
    private val string: String? = null


    @JvmStatic
    fun main(args: Array<String>) {

        /**
         * 1. Переменные
         */
        println("1. Переменные")

        println("Hello world!")
        val name: String = "Java"
        var age1: Int = 25
        var age2 = 25.5 //Double

        println(name)
        println(age1)
        println(age2)
        println(string?.length)
        println()

        /**
         * 2. Nulabble types
         */
        println("2. Nulabble types")

        val string1: String? = null
        val string2: String? = "1234"
        val string3: String? = ""

        val result = (string1?.length ?: 0) + (string2!!.length) + (string3!!.length)
        println(result)
        println()

        /**
         * 4. If construction
         */
        println("4. If construction")

        val food1: String
        val count1 = 600
        if (count1 > 500) {
            food1 = "Pizza"
        } else if (count1 > 300) {
            food1 = "Kebab"
        } else {
            food1 = "Dosirak"
        }
        println("Проидукт " + food1)
        println()

        //ИЛИ
        var count2 = 600
        val food2 = if (count2 > 500) {
            count2 -= 500
            "Pizza"
        } else if (count2 > 300) {
            count2 -= 300
            "Kebab"
        } else {
            count2 -= 30
            "Dosirak"
        }
        println("Проидукт $food2 длина строки ${food2.length} у вас осталось $count2 рублей")
        println()

        /**
         * 6. Условный оператор when (Аналог switch Java)
         */
        println("6. Условный оператор when (Аналог switch Java)")
        println("Пример 1")
        val nameOfMonth: String = "Март"
        val season = when (nameOfMonth) {
            "Декабрь", "Январь", "Февраль" -> {
                "Зима"
            }
            "Март", "Апрель", "Май" -> {
                "Весна"
            }
            "Июнь", "Июль", "Август" -> {
                "Лето"
            }
            "Сентябрь", "Октябрь", "Ноябрь" -> {
                "Осень"
            }
            else -> {
                "Не найдено";
            }
        }
        println(season)
        println()

        //Пример 2
        println("Пример 2")
        val indexOfMonth = 1
        val seasons = when (indexOfMonth) {
            12, 1, 2 -> {
                "Зима"
            }
            in 3..5 -> { //3, 4, 5
                "Весна"
            }
            in 6..8 -> {
                "Лето"
            }
            in 9..11 -> {
                "Осень"
            }
            else -> {
                "Не найдено";
            }
        }
        println(seasons)
        println()

        //Пример 3 when вместо if-else
        println("Пример 3")
        val temp = 80
        val state = when {
            temp < 0 -> "Твердое"
            temp < 100 -> "Жидкое"
            else -> "Газообразное"
        }
        println(state)
        println()

        //Пример 4
        println("Пример 4")
        val time = 23
        val weatherIsGood = true

        val result3 = when {
            time in 6..22 && weatherIsGood -> "Гулять"
            time in 6..22 && !weatherIsGood -> "Читать книгу"
            else -> "Спать"
        }
        println(result3)
        println()

        /**
         * 7. Колекции
         */
        println("7. Колекции")

        //Массив
        val array1: Array<Int?> = arrayOf(1, 2, 3, 4, 5)
        println(array1[2])

        //ArrayList
        //JAVA ArrayList<Integer> arrays = new ArrayList<>();
        val listOfNumbers: MutableList<Int> = ArrayList() // == mutableListOf()
        listOfNumbers.add(5)
        println(listOfNumbers[0]) // == listOfNumbers.get(0)
        println()

        /**
         * 9. Циклы
         */
        println("9. Циклы")
//        val array2: MutableList<Int> =  ArrayList()
//        val array2 = arrayOf(1, 2, 3, 4, 5, 6)
        //Пример 1
        val array2 = arrayOfNulls<Int?>(101)

        for (i in 0 until array2.size) { // i in 0..100
            array2[i] = i
        }

        for (i in array2) {
            print("$i ")
        }
        println()

        //Пример 2
        for (i in 100 downTo 0 step 2) { //step 2 - шаг (четные числа)
            print("$i ")
        }
        println()

        //Пример 3 умножение на 2
        val array3 = arrayOfNulls<Int?>(101)

        for (i in 0 until array3.size) {
            array3[i] = i
        }

        //Для умножения надо объявить index и дописать withIndex()
        for ((index, i) in array3.withIndex()) {
            array3[index] = i?.times(2) // i * 2
        }

        for (i in array3) {
            print("$i ")
        }

        //ДЗ
        val array4 = arrayOfNulls<Int?>(601)

        for ((index, i) in (0..600).withIndex()) {
            array4[index] = i
        }

        for (i in array4.size - 1 downTo 0 step 5) {
            print("${array4[i]} ")
        }
        println()

        /**
         * 10. Функции
         */
        println("10. Функции")






    }



}
