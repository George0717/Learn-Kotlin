import kotlin.math.tan

fun main(){
    val panjangBayangan = 5.0
    val sudutElevasi = 45.0
    val tinggiPohon = panjangBayangan * tan(Math.toRadians(sudutElevasi))
    println(tinggiPohon)
}