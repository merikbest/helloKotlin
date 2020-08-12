package kot.kot4_OOP.ООП3_Методы

import java.util.*

class Worker(val name: String, val position: String, val startYear: Int) {

    //Свойство объекта
    val experience: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        println("Работаю")
    }
}