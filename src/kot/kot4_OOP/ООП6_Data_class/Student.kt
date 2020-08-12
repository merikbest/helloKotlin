package kot.kot4_OOP.ООП6_Data_class

class Student(val name: String, val lastName: String, val id: String) {
    operator fun component1() = name
    operator fun component2() = lastName
    operator fun component3() = id
}