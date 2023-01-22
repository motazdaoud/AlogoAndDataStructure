package arrays.v1

class StringsOperations(val text: String) {

    fun reverseString(): String { // O(n) Time Complexity , O(n) Memory Complexity
        val charArray = CharArray(text.length)
        var index = text.length - 1
        var indexToPush = 0
        while (index >= 0) {
            charArray[indexToPush] = text[index]
            index--
            indexToPush++
        }

        return convertCharArrayToString(charArray)
    }

    private fun convertCharArrayToString(charArray: CharArray): String { // O(n) Time Complexity , O(n) Memory Complexity
        var text = ""
        charArray.forEach { char ->
            text += char
        }

        return text
    }


}