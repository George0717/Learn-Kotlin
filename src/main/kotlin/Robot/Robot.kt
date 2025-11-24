package Robot

import java.util.Random

class Robot(val name: String) {

    private val random = Random()
    private var strength: Int
    private var health: Int
    private var isAlive: Boolean = true

    init {
        strength = random.nextInt(100) + 10      // 10–109
        health   = random.nextInt(100) + 50      // 50–149
        report("Created (strength: $strength, health: $health)")
    }

    fun report(message: String) {
        println("[$name] $message")
    }

    private fun damage(damage: Int) {
        if (!isAlive) {
            report("Cannot be damaged, already destroyed.")
            return
        }

        val blocked = random.nextInt(100) < 30
        if (blocked) {
            report("Blocked attack!")
            return
        }

        health -= damage
        report("Received $damage damage | Health now $health")

        if (health <= 0 && isAlive) {
            isAlive = false
            report("DESTROYED!")
        }
    }

    fun attack(enemy: Robot) {
        if (!isAlive) {
            report("Cannot attack, robot is destroyed.")
            return
        }

        val damage = random.randomDamage(strength)
        report("Attacking ${enemy.name} with $damage damage")
        enemy.damage(damage)
    }
}
