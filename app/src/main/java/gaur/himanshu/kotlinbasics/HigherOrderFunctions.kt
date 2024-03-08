package gaur.himanshu.kotlinbasics


fun add(a: Int, b: Int): Int {
    return a.plus(b)
}

fun add2(
    a: Int, b: Int, c: (Int, Int) -> Int,
    d: () -> Unit
): Int {
    return c.invoke(a, b)
}

fun add3(a: Int, b: Int): (Int, Int) -> Int {
    return { c, d ->
        a.plus(b)
    }
}


fun main() {
    val result = add2(a = 2, b = 5, c = { c, d ->
        c.plus(d)

    }, d = {

    })
    val result2 = add3(2, 4)
    print(result2.invoke(5, 7))
}