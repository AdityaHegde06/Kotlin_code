fun main(args: Array<String>) {
    val n1 = 72
    val n2 = 120
    var lcm: Int

    // Initialize lcm to the greater of the two numbers
    lcm = if (n1 > n2) n1 else n2

    // Loop until we find the LCM
    while (true) {
        if (lcm % n1 == 0 && lcm % n2 == 0) {
            println("The LCM of $n1 and $n2 is $lcm.")
            break
        }
        lcm++
    }
}

