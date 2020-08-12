package kot.kot4_OOP.ООП8_Наследование

class Dog(weight: Float) : Animal("Собака", weight, "Суша") {
    override fun eat() {
        println("Кушаю кость")
    }
}