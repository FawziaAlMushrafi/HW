import kotlin.random.Random
//E5.7 pag75
fun main() {
        val greetingFunction = { playerName: String, numBuildings: Int ->
            val currentYear = 2018
            println("Adding $numBuildings houses")
            "Welcome to SimVillage, $playerName! (copyright $currentYear)"
        }
        println(greetingFunction("Guyal", 2))
        runSimulation("Guyal", greetingFunction)
    }
    fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
        val numBuildings = Random.nextInt(1,3 )
         // Randomly selects 1, 2, or 3
        println(greetingFunction(playerName, numBuildings))
    }

//E5.9

