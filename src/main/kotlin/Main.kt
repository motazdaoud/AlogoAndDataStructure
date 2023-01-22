import arrays.v1.StaticToDynamicArray
import arrays.v1.StringsOperations

fun main(args: Array<String>) {

    // Examples

    // A) Custom Array Class

    val customArray = StaticToDynamicArray()
    customArray.push(1)
    customArray.push(2)
    customArray.push(3)
    customArray.push(4)
    println(customArray.get())
    customArray.pop()
    println(customArray.get())
    customArray.pop(1)
    customArray.pop(2)
    println(customArray.get())
    println(customArray.checkIfItemIsFound(1))


    // B) String Operations
    val stringsOperations = StringsOperations("My Name is Motaz")
    println(stringsOperations.reverseString())


}