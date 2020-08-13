package kot.kot4_OOP.ООП10_Анонимные_классы.HomeWork

fun main() {
    val sportsmen = Sportsmen()

    sportsmen.invokeWaterBoy(object : WaterBoy{
        override fun bringWatter() {
            println("Вода принесена")
        }
    })

    //ИЛИ

    sportsmen.invokeWaterBoy { println("Вода принесена") }
}