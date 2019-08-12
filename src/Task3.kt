fun main(args: Array<String>) {
    var five: Char = '5'

    val stringFive = five.toString()

    val byteFive = stringFive.toByte()
    val shortFive = stringFive.toShort()
    val intFive = stringFive.toInt()
    val doubleFive = stringFive.toDouble()
    val floatFive = stringFive.toFloat()
    val longFive = stringFive.toLong()

    print("""byte: $byteFive
        |short: $shortFive
        |int: $intFive
        |double: $doubleFive
        |float: $floatFive
        |long: $longFive
    """.trimMargin())
}