package Antrian

infix fun String.example(function: () -> Unit) {
    println("---Exampe of $this---")
    function()
    println("-------------")

}