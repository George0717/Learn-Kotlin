fun main() {
    // ============================
    // 1. Cek angka dengan if - else if
    // ============================
    val number = 15

    if (number % 2 == 0) {
        println("$number adalah bilangan Genap")
    } else if (number % 3 == 0) {
        println("$number habis dibagi 3")
    } else if (number > 10) {
        println("$number lebih besar dari 10")
    } else {
        println("$number tidak memenuhi kondisi apapun")
    }

    val hourOfDay = 12
    val timeOfDay = if (hourOfDay < 6) {
        "Erly Morning"
    } else if (hourOfDay < 12){
        "Morning"
    } else if (hourOfDay < 17){
        "Afternoon"
    } else if (hourOfDay < 20) {
        "Evening"
    } else if (hourOfDay < 24) {
        "Late evening"
    } else {
        "Invalid"
    }
    println(timeOfDay)


    // ============================
    // 2. Looping angka 1..5
    // ============================
    println("\nLooping angka 1..5:")
    for (i in 1..5) {
        print("$i ")
    }
    println()

    // ============================
    // 3. Looping dengan while
    // ============================
    println("\nHitung mundur dari 5:")
    var count = 5
    while (count > 0) {
        println("Count = $count")
        count--
    }
    var sum = 1
    while (sum < 1000) {
        sum = sum + (sum + 1)

        // Iterasi per langkah:
        // Iterasi 1: sum = 1 + (1+1) = 3
        // Iterasi 2: sum = 3 + (3+1) = 7
        // Iterasi 3: sum = 7 + (7+1) = 15
        // Iterasi 4: sum = 15 + (15+1) = 31
        // Iterasi 5: sum = 31 + (31+1) = 63
        // Iterasi 6: sum = 63 + (63+1) = 127
        // Iterasi 7: sum = 127 + (127+1) = 255
        // Iterasi 8: sum = 255 + (255+1) = 511
        // Iterasi 9: sum = 511 + (511+1) = 1023 → stop (>= 1000)
    }
    println("Hasil akhir while: $sum") // 1023

    // =======================
    // Do-While version
    // =======================
    var sumNew = 1
    do {
        sumNew = sumNew + (sumNew + 1)

        // Iterasi per langkah:
        // Iterasi 1: sumNew = 1 + (1+1) = 3
        // Iterasi 2: sumNew = 3 + (3+1) = 7
        // Iterasi 3: sumNew = 7 + (7+1) = 15
        // Iterasi 4: sumNew = 15 + (15+1) = 31
        // Iterasi 5: sumNew = 31 + (31+1) = 63
        // Iterasi 6: sumNew = 63 + (63+1) = 127
        // Iterasi 7: sumNew = 127 + (127+1) = 255
        // Iterasi 8: sumNew = 255 + (255+1) = 511
        // Iterasi 9: sumNew = 511 + (511+1) = 1023 → stop (>= 1000)

    } while (sumNew < 1000)
    println("Hasil akhir do-while: $sumNew") // 1023

    sum = 1
    while (true) {
        sum = sum + (sum +1)
        if(sum >= 1000) {
            break
        }
    }
    println(sum)
    // ============================
    // 4. Cek hewan dengan if - else if
    // ============================
    val animal = "Burung"

    if (animal == "Kucing") {
        println("Hewan ini Kucing 🐱")
    } else if (animal == "Anjing") {
        println("Hewan ini Anjing 🐶")
    } else if (animal == "Burung") {
        println("Hewan ini Burung 🐦")
    } else {
        println("Hewan tidak dikenal ❓")
    }

    // ============================
    // 5. Looping list of animals
    // ============================
    val animals = listOf("Kucing", "Anjing", "Burung", "Ikan")
    println("\nDaftar hewan di list:")
    for (h in animals) {
        println("Hewan: $h")
    }
}
