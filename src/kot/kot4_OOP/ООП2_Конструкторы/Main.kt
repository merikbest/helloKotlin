package kot.kot4_OOP.ООП2_Конструкторы

fun main() {
    val russia = Country(population = 145_000_000)
    println("${russia.name} ${russia.population}")

//    russia.population = 145_000_000
    println(russia.population)

}