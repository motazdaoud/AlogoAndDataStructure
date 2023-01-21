import arrays.v1.StaticToDynamicArray

fun main(args: Array<String>) {

    // Examples

    // A) Custom Array Class

    val customArray = StaticToDynamicArray()
    customArray.push(1)
    customArray.push(2)
    customArray.push(3)
    customArray.push(3, 4)
    println(customArray.get())
    println(customArray.getWithIndex(3))
}