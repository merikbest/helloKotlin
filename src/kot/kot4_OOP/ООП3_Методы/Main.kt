package kot.kot4_OOP.ООП3_Методы

fun main() {
    val cat = Cat("Bobik", 15, 15f)
    cat.printInfo()

    val programmer = Worker("John Doe", "Java Developer", 2016)
    programmer.printInfo()

}

fun Cat.isOld() = age >= 15

//Функция выводяшяя информацию о работнике (Extension function)
fun Worker.printInfo() {
    println("Имя: $name Должность: $position Год устройства: $startYear Стаж: $experience ")
}
