package kot.kot4_OOP.ООП10_Анонимные_классы.HomeWork

class Sportsmen {
    fun invokeWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWatter()
    }

    inline fun invokeWaterBoy(bringWater: () -> Unit) {
        bringWater()
    }
}