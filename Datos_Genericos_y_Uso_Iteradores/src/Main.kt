fun <T> reverse(lista: List<T>): List<T> {
    val pila = Pila<T>()
    val iterador = lista.iterator()
    while (iterador.hasNext()) {
        pila.push(iterador.next())
    }

    val listaInvertida = mutableListOf<T>()
    while (!pila.isEmpty()) {
        pila.pop()?.let {
            listaInvertida.add(it)
        }
    }
    return listaInvertida
}

fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev: List<String> = reverse(numbers)
    println(if (!listOf("four", "three", "two", "one").equals(numbersRev)) "Error" else "Correcto")
    println(numbersRev)

    // Prueba con tipos de datos mixtos
    val mixtos = listOf(1, 2.5, 3f, "cuatro", true)
    val mixtosRev: List<Any> = reverse(mixtos)
    println(mixtosRev)
}
