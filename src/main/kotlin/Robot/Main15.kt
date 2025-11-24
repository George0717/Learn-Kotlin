package Robot

fun main() {
    val firstRobot = Robot("Wakanda")
    val secondRobot = Robot("I M Inevitabel")

    Battlefield.beginBattle(firstRobot, secondRobot) {
        println("\n🔥 Pemenang Pertarungan: $name 🔥")
    }
}
