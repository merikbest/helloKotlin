package kot.kot4_OOP.ООП8_Наследование.homework

fun main() {
    val worker = Worker("Worker", 54)
    val programmer = Programmer("Programmer", 28, "Java")

    worker.work()
    programmer.work()
}