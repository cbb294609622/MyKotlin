package com.cbb.kotlin07


/**
 * 泛型扩展函数
 * 新的泛型扩展函数不仅可以支持任何类型的接收者，还保留了接收者的类型信息。
 * 使用泛型类型后，扩展函数能够支持更多类型的接收者，适用范围更广了。
 */
fun String.addExts(amount:Int = 1) = this + "!".repeat(amount)

fun <T> T.easyPrintln():T {
    println(this)
    return this
}
fun main() {
    "22".easyPrintln().addExts(3).easyPrintln()
}
