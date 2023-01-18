import java.util.Random



fun main(args: Array<String>) {

    // initialize variables for user and computer dice rolls

    var userRoll: Int

    var computerRoll: Int

    // create a new instance of the Random class

    val random = Random()

    // create a while loop to continue the game until the user chooses to exit

    while (true) {

        // prompt the user to roll the dice

        println("Roll the dice? (y/n)")

        // get the user's input

        val userInput = readLine()

        // check if the user wants to exit the game

        if (userInput == "n") {

            println("Thanks for playing!")

            break

        }

        // generate a random number between 1 and 6 for the user's dice roll

        userRoll = random.nextInt(6) + 1

        // generate a random number between 1 and 6 for the computer's dice roll

        computerRoll = random.nextInt(6) + 1

        // print the results of the roll

        println("Your roll: $userRoll")

        println("Computer roll: $computerRoll")

        // determine the winner of the roll

        when {

            userRoll > computerRoll -> println("You win!")

            userRoll < computerRoll -> println("Computer wins!")

            else -> println("It's a tie!")

        }

    }

}
