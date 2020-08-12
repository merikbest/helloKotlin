package kot.kot4_OOP.ООП1_Введение_в_ООП

class User {
    //В Kotlin нужно указывать явно типы по умолчанию
    var age: Int = 0

    set(value) {
        if (value >= 0 ) {
            field = value
        }
    }

    var name: String? = null

    get() {
        return if (field == null) {
            ""
        } else {
            return field
        }
    }
}