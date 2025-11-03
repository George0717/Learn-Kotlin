fun main() {
    data class Grade(val letter: Char, val points: Double, val credits: Double)

    open class Person(var firstName: String, var lastName: String) {
        fun fullName() = "$firstName $lastName"
    }

    open class Student(
        firstName: String,
        lastName: String,
        var grades: MutableList<Grade> = mutableListOf()
    ) : Person(firstName, lastName) {

        fun recordGrade(grade: Grade) {
            grades.add(grade)
        }

        fun showGradeHistory() {
            if (grades.isEmpty()) {
                println("${fullName()} belum memiliki nilai.")
            } else {
                println("Riwayat Nilai ${fullName()}:")
                grades.forEachIndexed { index, grade ->
                    println("  ${index + 1}. Nilai: ${grade.letter}, Poin: ${grade.points}, SKS: ${grade.credits}")
                }
            }
        }
    }

    open class BandMember(firstName: String, lastName: String) : Student(firstName, lastName) {
        open val minimumPracticeTime: Int
            get() = 2

        fun practice() {
            println("${fullName()} berlatih selama minimal $minimumPracticeTime jam.")
        }
    }

    class OboePlayer(firstName: String, lastName: String) : BandMember(firstName, lastName) {
        override val minimumPracticeTime: Int
            get() = 4

        fun playOboe() {
            println("${fullName()} memainkan alat musik Oboe dengan indah.")
        }
    }

    fun phoneBookName(person: Person): String {
        return "${person.lastName}, ${person.firstName}"
    }
    val person = Person(firstName = "Johny", lastName = "Wijaya")

    var hallMonitor = Student(firstName = "Jill", lastName = "Banana")

    // --- Contoh penggunaan ---
    val jane = Student("Jane", "Doe")
    val john = Person("John", "Smith")

    jane.recordGrade(Grade('A', 4.0, 3.0))
    jane.recordGrade(Grade('B', 3.0, 2.0))

    println("Nama lengkap: ${jane.fullName()}")
    jane.showGradeHistory()

    val oboePlayer = OboePlayer("Emily", "Clark")
    oboePlayer.recordGrade(Grade('A', 4.0, 4.0))
    oboePlayer.practice()
    oboePlayer.playOboe()
    oboePlayer.showGradeHistory()

    hallMonitor = oboePlayer

}
