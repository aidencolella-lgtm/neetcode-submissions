class DynamicArray(capacity: Int) {
    private var arr: IntArray
    private var length: Int = 0
    private var capacity: Int = capacity

    init {
        this.arr = IntArray(this.capacity)
    }

    fun get(i: Int): Int {
        return arr[i]
    }

    fun set(i: Int, n: Int) {
        arr[i] = n
    }

    fun pushback(n: Int) {
        if (length == capacity) {
            resize() }

        arr[length] = n
        length ++
    }

    fun popback(): Int {
        if (length > 0) {
            length -- }

        return arr[length]
    }

    private fun resize() {
        capacity *= 2
        val newArr = IntArray(capacity)

        for (i in 0 until length) {
            newArr[i] = arr[i]
        }

        arr = newArr
    }

    fun getSize(): Int {
        return length
    }

    fun getCapacity(): Int {
        return capacity
    }
}
