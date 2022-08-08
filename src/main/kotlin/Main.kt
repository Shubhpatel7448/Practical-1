import java.lang.reflect.Type

fun main() {
    println("hello world")
    println("-------------------------Variables--------------------------------------")
    val integer: Int = 7
    println("integer : $integer")
    val float = 1.5F
    println("float : $float")
    val character: Char = 'x'
    println("character : $character")
    val string: String = "Hi"
    println("String : $string")
    val bool: Boolean = true
    println("Boolean : $bool")
    val double: Double = 96.36
    println("Double : $double")
    val long: Long = 20012011127
    println("Long : $long")
    val short: Short = -2
    println("Short : $short")
    val byte: Byte = 127
    println("Byte : $byte")
    p2()

}
fun p2() {

    println("----------------------------Type Casting--------------------------------")

    val x = 7
    println("Integer : $x")
    x.toDouble()
    println("Int to Double : $x ")

    val string = "20"
    println("String : $string")
    string.toInt()
    println("String to Int : $string")

    string.toDouble()
    println("String to Double : $string")


}