package kot.kot4_OOP.ООП3_Методы

class Cat(val name: String, val age: Int, val weight: Float = 0f) {
    fun printInfo() {
        println("Кличка: $name, Возрвст: $age, Вес: $weight")
    }
}