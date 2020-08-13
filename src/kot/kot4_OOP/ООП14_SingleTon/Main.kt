package kot.kot4_OOP.ООП14_SingleTon

fun main() {
    val db = DataBase
    db.insertData("1")
    db.insertData("2")

    val test = Test()
    test.insertData("3")
    test.insertData("4")

    for (str in db.data) {
        println(str)
    }
}