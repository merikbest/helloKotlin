package kot.kot3_Functional_programming

fun main() {
    //Пример 1
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()

    for (i in 0..10) {
        names.add("Employee $i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }

    val users = names.zip(phones)
    for (user in users) {
        println("Имя: ${user.first} Телефон: ${user.second}")
    }

    //Пример 2
    val firstName = mutableListOf<String>()
    val lastName = mutableListOf<String>()

    for (i in 0..10) {
        firstName.add("Hello$i")
        lastName.add("World$i")
    }

    val firstLastName = firstName.zip(lastName)

    for (name in firstLastName) {
        println("Имя: ${name.first} Фамилия: ${name.second}")
    }

    //Пример 3
    val fullNames = mutableListOf<String>()

    for (i in 0..10) {
        fullNames.add("Имя$i Фамилия$i")
    }

    val firstName2 = fullNames.map { it.substringBefore(" ") }
    val lastName2 = fullNames.map { it.substringAfter(" ") }
    val users2 = firstName2.zip(lastName2)

    for (user in users2) {
        println("Имя: ${user.first} Фамилия: ${user.second}")
    }
}