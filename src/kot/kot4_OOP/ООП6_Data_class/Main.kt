package kot.kot4_OOP.ООП6_Data_class

fun main() {
    val student1 = Student("John", "Doe", "123456")
    val student2 = Student("John", "Doe", "123456")

    //destructor
    val (name, lastname, id) = student1
    println(name)
    println(lastname)
    println(id)
}
