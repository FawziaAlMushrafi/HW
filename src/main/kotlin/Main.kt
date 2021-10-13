fun main() {
    println("Designs a caluator")
    println("Enter two value")
    print("a =")
    var a = readLine()!!.toDouble()
    print("b =")
    var b = readLine()!!.toDouble()
    println("1.Addiion \n2. Substraction \n3. Multiplication \n4. Divide \n5.Modulo ")
    print("Enter chice:")
    var f = readLine()!!.toInt()
    print("result :")
    when (f) {
        1 -> print("a+b=${a + b}")
        2 -> print("a-b=${a - b}")
        3 -> print("a*b=${a * b}")
        4 -> print("a/b=${a / b}")
        5 -> print("a%b=${a % b}")
        else -> print("Wrong choice")
    }
}
