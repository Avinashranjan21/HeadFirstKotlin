

fun main(){
    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    println("Option selected by computer is $gameChoice")
    val userChoice = getUserChoice(options)
    printResult(userChoice,gameChoice)
}

fun getGameChoice(optionParam:Array<String>) =
        optionParam[(Math.random()* optionParam.size).toInt()]

fun getUserChoice(optionParam: Array<String>):String {
    var isValidChoice = false
    var userChoice =""

    // Loop until the user enters a valid choice
    while (!isValidChoice){
        // Ask the user for their choice
        print("Please enter one of the following:")
        for (item in optionParam) print(" $item")
        println(".")

        // Read the user input
        val userInput = readLine()
        // Validate the user input
        if (userInput !=null && userInput in optionParam){
            isValidChoice = true
            userChoice = userInput
        }
        // if the choice is invalid, inform the user
        if (!isValidChoice) print("You must enter a valid choice.")
    }
 return userChoice
}

fun printResult(userChoice:String,gameChoice:String){
    val result:String

    if (userChoice == gameChoice) result = "Tie!"

    else if((userChoice =="Rock" && gameChoice == "Scissors")||
        (userChoice=="Paper" && gameChoice =="Rock") ||
        (userChoice =="Scissors" && gameChoice == "Paper")) result = "You Win!"
    else result= "You Lose!"

    println("You choose $userChoice. I choose $gameChoice. $result")
}