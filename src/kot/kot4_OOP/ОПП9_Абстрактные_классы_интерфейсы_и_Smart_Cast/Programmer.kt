package kot.kot4_OOP.ОПП9_Абстрактные_классы_интерфейсы_и_Smart_Cast

class Programmer(name: String, age: Int, val language: String) : Worker(name, age), Cleaner {
    override fun work() {
        println("Writing $language code")
    }

    override fun clean() {
        println("Programmer $name cleaning")
    }
}