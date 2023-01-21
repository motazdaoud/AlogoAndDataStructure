package arrays.v1

class StaticToDynamicArray() {

    var length: Int = 0
    var data: Array<Int?> = arrayOfNulls<Int>(length)

    fun get(index: Int): Int? { // O(1) Time Complexity, O(1) Memory Complexity
        if (checkIndexNotAvailable(index)) {
            throw ArrayIndexOutOfBoundsException("Given Index : $index : not available.")
        } else {
            return data[index]
        }
    }

    fun get(): String { // O(n) time complexity, O(n) Memory complexity
        var dataString = ""
        data.forEach { item ->
            dataString = " $item $dataString "
        }
        return dataString.trim()
    }

    fun getWithIndex(index: Int): Int? {
        if (checkIndexNotAvailable(index)) {
            throw ArrayIndexOutOfBoundsException("Given Index : $index : not available.")
        } else {
            return data[index]
        }
    }

    fun push(item: Int) { // O(n) Time Complexity , // O(n) Memory Complexity

        pushItemToArray(pushIndex = null, item = item)
    }

    fun push(index: Int, item: Int) {  // O(n) Time Complexity , // O(n) Memory Complexity
        pushItemToArray(pushIndex = index, item = item)
    }

    private fun pushItemToArray(pushIndex: Int?, item: Int) {  // O(n) Time Complexity , // O(n) Memory Complexity
        val newArray = arrayOfNulls<Int>(length + 1)
        var index = 0
        while (index < length) {
            newArray[index] = data[index]
            index++
        }
        if (pushIndex == null) {
            newArray[newArray.size - 1] = item
        } else {
            newArray[pushIndex] = item

        }

        data = newArray
        length++
    }


    private fun checkIndexNotAvailable(index: Int): Boolean {
        return index >= length
    }
}