fun main() {
    var name = "John White"
    var age = 25
    var occupation = null
//    Sentinel Value
//    var errorCode = 0
    var errorCode: Int? // nullable Int
    errorCode = 100
    println(errorCode)
    errorCode = null
    println(errorCode)

//    Checking for null
    var result: Int? = 30
    println(result)
    println(result!! + 1)

    var authorName: String? = "Budi"
    println(authorName)
    println("nama saya ${authorName!!}")

//    Smart Casts
    var nonNullableAuthor: String
    var nullAbleAuthor: String?

    if(authorName != null) {
        nonNullableAuthor = authorName
    }else {
        nullAbleAuthor = authorName
    }

//    Safe Call
    authorName = "Taeko Ischi"
    var nameLength = authorName?.length
    println("Author's name has length $nameLength")
    val nameLengthPlus5 = authorName?.length?.plus(5)
    println("Author's name has length $nameLengthPlus5")

    authorName?.let {
        nonNullableAuthor = authorName
    }
    authorName?.let {
        nameLength = authorName.length
    }
    var nullAbleInt: Int? = 10
    var mustHaveResult = nullAbleInt ?: 0

}