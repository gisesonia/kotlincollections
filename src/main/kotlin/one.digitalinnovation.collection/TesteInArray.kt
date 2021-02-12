package one.digitalinnovation.collection

fun main(){
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("-------------For Loop-------------------")
    for (valor in values) {
        println(valor)
    }

    println("----------------Função forEach--------------------")
    values.forEach { valor ->
        println(valor)
    }

    println("----------------Indices property-------------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("-------------Array sort-------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }

   /* values.forEach {
        println(it)
    }*/
}