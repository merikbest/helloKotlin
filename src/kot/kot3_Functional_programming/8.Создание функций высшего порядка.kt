package kot.kot3_Functional_programming

fun main() {
    val result = modifyString("Hello Kotlin!",{it.toUpperCase()})
    println(result)

    val list=(0..100).toList()

    sumOfList(list) {
        println(it.sum())
    }
}

fun modifyString(string: String, modify: (String) -> String ) : String {
    return modify(string)
}

//ЕСЛИ МЫ СОЗДАЕМ НЕБОЛЬШОЙ МЕТОД В КАЧЕСТВЕ ПАРАМЕТРА ПРИНИМАЕТ ФУНКЦИЮ ТОГДА ЕГО НУЖНО ДЕЛАТЬ inline
inline fun sumOfList(list: List<Int>, operator: (List<Int>) -> Unit) {
    operator(list)
}