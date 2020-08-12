package kot.kot4_OOP.ОПП9_Абстрактные_классы_интерфейсы_и_Smart_Cast

class Seller(name: String, age: Int) : Worker(name, age), Cleaner {
    override fun work() {
        println("Selling product")
    }

    override fun clean() {
        println("Seller $name cleaning")
    }
}