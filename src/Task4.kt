//Напишите программу, запрашивающую имя пользователя и выводящую приветствие пользователя в консоль, после ввода имени.
fun main(args: Array<String>) {
    println("Введите имя и нажмите Enter:")
    val userName: String? = readLine()
    val stringText: String = userName.toString()
    print("Приветик, $stringText :)")
}