package kot.kot4_OOP.ООП14_SingleTon

object DataBase {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }
}