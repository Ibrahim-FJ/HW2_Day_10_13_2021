import kotlin.math.pow

fun main(){
    val name = "Ibrahim"
    val healthPoints = 70
    val isBlessed = true
    val isImmortal = false


   val auraColor = when ((Math.random().pow((110 - healthPoints) / 100.0) * 20 ).toInt()){

        in 0..5 -> "Red"
        in 6..10 -> "Orange"
        in 11..15 -> "Purple"
        in 16..20 -> "Green"

        else -> "Out of Range"
    }
    if (isBlessed && healthPoints > 50 || isImmortal) {

        // to specify the health status
        val healthStatus: String = when (healthPoints) {
            100 -> "is in excellent condition!"
            in 90..99 -> "has a few scratches."
            in 75..89 -> if (isBlessed) {
                "has some minor wounds but is healing quite quickly!"
            } else {
                "has some minor wounds."
            }
            in 15..74 -> "looks pretty hurt."
            else -> "is in awful condition!"
        }


            // to print the player status
        println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "YES" else "NO"})\n$name $healthStatus")

    } else {
        println("NONE")
    }


}