fun main(args: Array<String>) {

//    println("Hello Kotlin")

    /* Запрашиваем у пользователя текст */
    println("Напишите что либо в консоль и нажмите Enter:")

    /* Сохраняем текст в переменную с именем userText типа 'String?' */
    var userText: String? = readLine()

    /* Сохраняем в переменной stringText типа 'String' значение из переменной userText изменяя тип. Для множества операций тип 'String?' не подойдет. */
    var stringText: String = userText.toString()

    /* Выводим значение stringText в консоль */
    print("Вы написали: $stringText")

}