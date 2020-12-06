import kotlin.random.Random

//2. Відсортувати map<Int, String> по зростанню значення ключа.

fun main() {
    val inputMap = HashMap<Int, String>()
    for (i in 0..10) {
        var tmp: Int
        do {
            tmp = Random.nextInt(0, 100)
        } while (inputMap.containsKey(tmp))
        inputMap[tmp] = "value$tmp"
    }

    val sortedMap = inputMap.toSortedMap()

    println(inputMap.keys)
    println(sortedMap.keys)
}
