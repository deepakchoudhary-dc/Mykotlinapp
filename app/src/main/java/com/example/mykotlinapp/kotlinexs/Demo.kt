package com.example.mykotlinapp.kotlinexs

fun main() {
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }
    val upperCase5: (String) -> String = { it.uppercase() }
    println(upperCase1("hello"))
    println(upperCase5("hello"))

    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")

}
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3




