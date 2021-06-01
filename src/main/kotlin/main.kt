fun enterinput(name: String, phoneNumber: String): String {
    var name = "        "
    var phoneNumber = "         "
    var ans: String
    println("Enter your Name: ")
    name = readLine()!!.toString()
    println("Enter your phone number: ")
    phoneNumber = readLine()!!.toString()
    ans = name + phoneNumber
    return ans
}

fun enterinput(businessName: String, contactName: String, phoneNumber: String): String {
    var businessName = "        "
    var contactName = "        "
    var phoneNumber = "        "
    var ans: String
    println("Enter your Business Name: ")
    businessName = readLine()!!.toString()
    println("Enter your Contact Name: ")
    contactName = readLine()!!.toString()
    println("Enter your phone number: ")
    phoneNumber = readLine()!!.toString()
    ans = businessName + contactName + phoneNumber
    return ans
}


fun main(args: Array<String>) {
    // Print the menu choices and see what area the user would like to calculate. Error check too.
    var menuChoice = 0
    var name: String
    var businessName: String
    var contactName: String
    var phoneNumber: String
    do {
        println()
        println("1) Are you a Residential customer? -- Type 1")
        println("2) Are you a Business customer? -- Type 2")
        println("5) Exit the program -- Type 3")
        menuChoice = readLine()!!.toInt()
        when (menuChoice) {
            1 -> enterinput(name, phoneNumber)
            2 -> enterinput(businessName, contactName, phoneNumber)
            3 -> print("Goodbye.")
            !in 1..3 -> print("This is not a valid choice please choose again.                                                                                                        ")
        }
    } while (menuChoice != 3)
}