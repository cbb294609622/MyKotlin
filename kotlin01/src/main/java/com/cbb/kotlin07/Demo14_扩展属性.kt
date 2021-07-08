package com.cbb.kotlin07


/**
 * 扩展属性
 * 除了给类添加功能扩展函数外，你还可以给类定义扩展属性，给String类添加一个扩展。
 * 这个扩展属性可以统计字符串里有多少个元音字母
 */

val String.numVowels
    get() = count{"aeiouy".contains(it)}

fun <T> T.easyPrintlns():T {
    println(this)
    return this
}

fun main() {
    "abcdeaeofi1ou2ghij123ekal1d".numVowels.easyPrintlns()
}