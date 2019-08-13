fun main(args: Array<String>) {
    println("Введите первое число и нажмите Enter:")
    val num1: Double
    try {
        num1 = readLine()!!.toDoubleOrNull()!!
    } catch (e: NullPointerException) {
        println("Необходимо ввести число без дополнительных символов")
        return
    }

    println("Введите второе число и нажмите Enter:")
    val num2: Double
    try {
        num2 = readLine()!!.toDoubleOrNull()!!
    } catch (e: NullPointerException) {
        println("Необходимо ввести число без дополнительных символов")
        return
    }

    val result = num2 > num1
    println("Второе число больше, чем первое? $result")

}