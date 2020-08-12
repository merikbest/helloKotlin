package kot.kot4_OOP.ООП8_Наследование

open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Eating")
    }

    open fun run() {
        println("Run")
    }
}