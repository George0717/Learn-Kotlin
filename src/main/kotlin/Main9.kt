class Person(var firstName: String, var lastName: String) {
    val fullName: String
        get() = "$firstName $lastName"
}

class SimplePerson(val name: String)

class Grade(val letter: String, val points: Double, val credits: Double)

class Student(
    val firstName: String,
    val lastName: String,
    val grades: MutableList<Grade> = mutableListOf(),
    var credits: Double = 0.0
) {
    fun recordGrade(grade: Grade) {
        grades.add(grade)
        credits += grade.credits
    }

    fun getGPA(): Double {
        if (grades.isEmpty()) return 0.0
        val totalPoints = grades.sumOf { it.points * it.credits }
        val totalCredits = grades.sumOf { it.credits }
        return totalPoints / totalCredits
    }
}

fun main() {
    val john = Person(firstName = "Johnny", lastName = "Wijaya")
    println(john.fullName)

    var var1 = SimplePerson(name = "John")
    var var2 = var1

    println(var1.name)
    println(var2.name)

    var homeOwner = john
    john.firstName = "John"
    println(john.firstName)
    println(homeOwner.firstName)

    // Object Identity
    println(homeOwner === john) // true
    val impostor = Person(firstName = "Anton", lastName = "Ferguso")
    println(john === homeOwner) // true
    println(john === impostor) // false
    println(impostor === homeOwner) // false

    homeOwner = impostor
    println(john === homeOwner) // false (karena homeOwner sekarang menunjuk ke impostor)

    // create fake impostor john
    val imposters = (0..100).map {
        Person(firstName = "Anton", lastName = "Ferguso")
    }

    val hasAnton = imposters.any {
        it.firstName == "Anton" && it.lastName == "Ferguso"
    }

    println(hasAnton) // ✅ Output: true

    val mutableImposters = mutableListOf<Person>()
    mutableImposters.addAll(imposters)

    println(mutableImposters.contains(john)) // false (karena john belum ditambahkan)

    mutableImposters.add(john)
    println(mutableImposters.contains(john)) // true (sekarang sudah ada john)

    val indexOfJohn = mutableImposters.indexOf(john)
    if (indexOfJohn != -1) {
        mutableImposters[indexOfJohn].lastName = "Budi"
    }
    println(john.fullName)

    // ✅ Contoh penggunaan Student dan Grade
    val jane = Student(firstName = "Jane", lastName = "Doe")

    // Contoh nilai (Grade)
    val history = Grade(letter = "A", points = 4.0, credits = 3.0)
    val math = Grade(letter = "B+", points = 3.5, credits = 4.0)
    val science = Grade(letter = "A-", points = 3.7, credits = 2.0)

    // Rekam nilai
    jane.recordGrade(history)
    jane.recordGrade(math)
    jane.recordGrade(science)

    println("\n📚 Rekap nilai ${jane.firstName} ${jane.lastName}:")
    jane.grades.forEach { grade ->
        println(" - Mata kuliah: ${grade.letter} | Poin: ${grade.points} | Kredit: ${grade.credits}")
    }

    println("Total Kredit: ${jane.credits}")
    println("IPK (GPA): ${"%.2f".format(jane.getGPA())}")
}
