package kot.kot4_OOP.ООП8_Наследование.homework

class Programmer(name: String, age: Int, val language: String) : Worker(name, age) {
    override fun work() {
        println("Writing $language code")
    }
}