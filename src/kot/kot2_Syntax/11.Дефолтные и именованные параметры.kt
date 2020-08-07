package kot.kot2_Syntax


fun main() {
//    printInfo("Иванов", "Иван", "Иванович")
    //явное указание параметра
    printInfo(patronymic = "Иванович")
    volume(5)
}

//значения по умолчанию в параметре методов String = ""
fun printInfo(lastName: String = "", firstName: String = "", patronymic: String = "") {
    if (patronymic.isNotEmpty()) {
        println("Фамилия: $lastName")
    }

    if (patronymic.isNotEmpty()) {
        println("Имя: $firstName")
    }

    if (patronymic.isNotEmpty()) {
        println("Отчество: $patronymic")
    }
}

//Объем паралелепипеда (если передана 1 сторона, то все они равны)
fun volume(a: Int, b: Int = a, c: Int = a) = println(a * b * c)
