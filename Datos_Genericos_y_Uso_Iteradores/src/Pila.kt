class Pila<T> {
    private var elementos: MutableList<T> = mutableListOf()

    fun push(elemento: T) {
        elementos.add(elemento)
    }

    fun pop(): T? {
        if (isEmpty()) {
            return null
        }
        return elementos.removeAt(elementos.size - 1)
    }

    fun top(): T? {
        return elementos.lastOrNull()
    }

    fun isEmpty(): Boolean {
        return elementos.isEmpty()
    }
}
