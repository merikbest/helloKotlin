package kot.kot4_OOP.ООП10_Анонимные_классы

fun main() {
//    val car: Transport = Car()
//    val bike: Transport = Bike()

//    if (car !is Car || car.startEngine())

    travel(object : Transport("Автобус") {
        override fun drive() {
            println("Автобус едет")
        }
    })
}

fun travel(transport: Transport) {
    transport.drive()
}