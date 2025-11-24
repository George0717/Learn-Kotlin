package Robot

import java.util.Random

private val rng = Random()

// Extension: Random Strength
val Robot.randomStrength: Int
    get() = rng.nextInt(50) + 20   // 20–69

// Extension: Random Bonus Damage
val Robot.randomBonusDamage: Int
    get() = rng.nextInt(15)        // 0–14

// Extension: Full random attack process
fun Robot.randomAttackTo(enemy: Robot) {
    val bonus = randomBonusDamage
    val base = randomStrength

    val total = base + bonus
    this.report("Random Attack → Damage: $total")
    enemy.attack(this) // tetap gunakan mekanisme asli
}

fun Random.randomDamage(strength: Int): Int {
    return this.nextInt(strength / 2) + 5
}
