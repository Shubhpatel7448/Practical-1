
fun main(args: Array<String>) {
    print("Enter a number:")
    val a = readLine()!!.toInt()
    if (a % 2 == 0) {
        println("\n$a is Even number")
    }
    else {
        println("\n$a is Odd number")
    }
}
