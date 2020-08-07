package kot.kot2_Syntax

fun main() {
    println(sum("10", "20"))

}

fun sum(a: String, b: String): Int {
/*    try {
        val aNum = a.toInt()
        val bNum = b.toInt()

        return aNum + bNum
    } catch (e: Exception) {
        return 0
    }*/

    //ИЛИ
    return try {
        val aNum = a.toInt()
        val bNum = b.toInt()

        aNum + bNum
    } catch (e: Exception) {
        0
    }
}