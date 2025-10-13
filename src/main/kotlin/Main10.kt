class Students(val id: Int, val firstName: String, val lastName: String) {
    var fullName = "$lastName, $firstName"
}

object StudentRegistry {
    private val students = mutableListOf<Students>()

    fun addStudent(student: Students) {
        students.add(student)
        println("Student added: ${student.fullName}")
    }

    fun printAllStudents() {
        println("\n=== Student List ===")
        for (student in students) {
            println("${student.id}: ${student.fullName}")
        }
    }
}

object JsonKeys {
    const val JSON_KEY_ID = "id"
    const val JSON_KEY_FIRSTNAME = "first_name"
    const val JSON_KEY_LASTNAME = "last_name"
}

class Scientist private constructor(val id: Int, val firstName: String, val lastName: String) {
    var fullName = "$firstName, $lastName"

    companion object {
        private var nextId = 1

        fun newScientist(firstName: String, lastName: String): Scientist {
            val scientist = Scientist(nextId, firstName, lastName)
            println("Scientist created: ${scientist.fullName} (ID: ${scientist.id})")
            nextId++
            return scientist
        }
    }
}

object ScientistRepository {
    private val allScientists = mutableListOf<Scientist>()

    fun addScientist(scientist: Scientist) {
        allScientists.add(scientist)
        println("Scientist added to repository: ${scientist.fullName}")
    }

    fun removeScientist(scientist: Scientist) {
        allScientists.remove(scientist)
        println("Scientist removed from repository: ${scientist.fullName}")
    }

    fun listAllScientists() {
        println("\n=== Scientist Repository ===")
        if (allScientists.isEmpty()) {
            println("No scientists in the repository.")
        } else {
            allScientists.forEach {
                println("${it.id}: ${it.fullName}")
            }
        }
    }
}

// ============================================
// Anonymous Classes Example
// ============================================

interface ScientistAction {
    fun onScientistAdded(scientist: Scientist)
    fun onScientistRemoved(scientist: Scientist)
}

fun main() {
    // --- Students ---
    val marie = Students(1, "Marie", "Curie")
    val toni = Students(2, "Toni", "Tani")
    val wadi = Students(3, "Wadi", "Template")

    StudentRegistry.addStudent(marie)
    StudentRegistry.addStudent(toni)
    StudentRegistry.addStudent(wadi)

    StudentRegistry.printAllStudents()

    // --- Scientists ---
    val emmy = Scientist.newScientist("Gaia", "Emmy")
    val ferguso = Scientist.newScientist("El", "Cado")
    val nakan = Scientist.newScientist("Mullet", "Prekitiew")

    ScientistRepository.addScientist(emmy)
    ScientistRepository.addScientist(ferguso)
    ScientistRepository.addScientist(nakan)

    ScientistRepository.listAllScientists()

    // --- Anonymous Class Usage ---
    val scientistHandler = object : ScientistAction {
        override fun onScientistAdded(scientist: Scientist) {
            println("🔹 [Anonymous Handler] Scientist added event detected: ${scientist.fullName}")
        }

        override fun onScientistRemoved(scientist: Scientist) {
            println("🔸 [Anonymous Handler] Scientist removed event detected: ${scientist.fullName}")
        }
    }

    // Demonstrate anonymous class actions
    scientistHandler.onScientistAdded(emmy)
    scientistHandler.onScientistRemoved(ferguso)
}
