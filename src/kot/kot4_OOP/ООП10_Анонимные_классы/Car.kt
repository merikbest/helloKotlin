package kot.kot4_OOP.ООП10_Анонимные_классы

class Car(override var name: String = "Car") : Transport(name) {
    override fun drive() {
        println("Car driving")
    }

    fun startEngine() : Boolean {
        println("Starting engine")
        return true
    }
}