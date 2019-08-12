fun main(args: Array<String>) {
    println("Введите имя и нажмите Enter:")
    val userName: String? = readLine()
    val stringText: String = userName.toString()
    print("Приветик, $stringText :)")
}