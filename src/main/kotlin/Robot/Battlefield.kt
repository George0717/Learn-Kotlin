package Robot

object Battlefield {

    fun beginBattle(
        firstRobot: Robot,
        secondRobot: Robot,
        onBattleEnded: Robot.() -> Unit
    ) {
        println("=== BATTLE STARTED ===")

        battle(firstRobot, secondRobot)

        val winner = if (isAlive(firstRobot)) firstRobot else secondRobot
        winner.onBattleEnded()
    }

    private const val MAX_TURNS = 50

    tailrec fun battle(a: Robot, b: Robot, turn: Int = 1) {
        if (turn > MAX_TURNS) {
            println("Battle stopped — max turn reached!")
            return
        }

        if (!isAlive(a) || !isAlive(b)) return

        println("\n--- Turn $turn ---")
        a.attack(b)
        if (!isAlive(b)) return

        b.attack(a)
        if (!isAlive(a)) return

        battle(a, b, turn + 1)
    }

    private fun isAlive(robot: Robot) =
        robot.toString().contains("health", ignoreCase = false).not() // fallback
}
