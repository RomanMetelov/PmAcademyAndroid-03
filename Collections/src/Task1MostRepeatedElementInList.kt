//1. Є список, деякі елементи якого повторюються кілька разів. Знайти елемент, який повторюється найчастіше.

fun main() {
    var inputList: List<Any>? = mutableListOf<Any>(
            1, 2, 3, 3, "String", "String1",
            "String1", 2, 3, "String1", "String1")

    print(inputList?.let { searchMostRepeatedElementInList(it) })
}

fun searchMostRepeatedElementInList(list: List<Any>): Any? {
    //создаём мапу, где ключ - каждый уникальный элемент в исходном листе,
    //а значение - количество повторов этого элемента в листе
    val map: MutableMap<Any, Int> = mutableMapOf()
    list.forEach{
        if (map.containsKey(it)) map[it] = map.getValue(it) + 1
        else map[it] = 1
    }

    //находим максимальное значение value - максимальное кол-во повторов элемента в листе
    var maxKey: Any? = null
    var maxValue = 0
    map.forEach { (k, v) ->
        if (v > maxValue) {
            maxValue = v
            maxKey = k
        }
    }

    return maxKey
}



