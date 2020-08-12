package kot.kot4_OOP.ООП8_Наследование.homework

open class Worker(val name: String, val age: Int) {
    open fun work() {
        println("Working...")
    }
}