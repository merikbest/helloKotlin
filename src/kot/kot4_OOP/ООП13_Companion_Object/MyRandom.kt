package kot.kot4_OOP.ООП13_Companion_Object

class MyRandom {
    companion object {
        private const val MONDAY: String = "Пн"
        private const val TUESDAY: String = "ВТ"
        private const val WENSDAY: String = "Срд"
        private const val THURSDAY: String = "Чт"
        private const val FRIDAY: String = "Пт"
        private const val SATURDAY: String = "Сб"
        private const val SUNDAY: String = "Вс"

        fun randomNumber(from: Int, to: Int) = (Math.random() * (to - from + 1)).toInt() + from

        fun randomBoolean() = randomNumber(0, 1) > 0

        fun randomDayOfWeak(): String {
            val index = randomNumber(1, 7)

            return when(index) {
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WENSDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                else -> SUNDAY
            }
        }
    }
}