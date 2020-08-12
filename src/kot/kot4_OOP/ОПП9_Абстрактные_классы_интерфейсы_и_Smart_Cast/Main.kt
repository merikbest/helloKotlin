package kot.kot4_OOP.ОПП9_Абстрактные_классы_интерфейсы_и_Smart_Cast

fun main() {
    val workers = mutableListOf<Worker>()
    workers.add(Director("Petrov", 54))
    workers.add(Seller("Valera", 54))
    workers.add(Programmer("Denis", 28, "Java"))

    for (worker in workers) {
        worker.work()

        if (worker is Cleaner) {
            worker.clean()
        }
    }

    //Привести workers как Cleaner
    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }

    for (cleaner in cleaners) {
        cleaner.clean()
    }
}