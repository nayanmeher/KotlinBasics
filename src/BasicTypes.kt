fun main() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 1000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

   // println(boxedA === anotherBoxedA) // true
    //println(boxedB === anotherBoxedB) // false

    //String literals
    val s= "Hello world !\n"
    val st = """

            for (c in foo)
                println(c)
    
    """
    //println(st)
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    println(text)
}