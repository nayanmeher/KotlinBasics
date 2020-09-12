
fun filter(list: List<String>, checkLength:((String)->Int)){
    //use of higher order function
    /*list
        .forEach {
           val length: Int = checkLength(it)
            println("$it -> $length")

    }*/

    //function given by kotlin to modify the collection
    list.associate {
        it to it.length
    }.forEach{
        println("${it.key} --> ${it.value}")
    }
}

fun main() {
    //println("Hello world, This is my first kotlin file.")
    val list = listOf("audi", "mercedes", "bmw", "Lamborghini", "aston martin", "Maserati")
    filter(list) { it.length }
}

