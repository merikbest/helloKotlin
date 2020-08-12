package kot.kot4_OOP.ОПП9_Абстрактные_классы_интерфейсы_и_Smart_Cast

class Director(name: String, age: Int) : Worker(name, age) {
    override fun work() {
        println("Controlling...")
    }
}