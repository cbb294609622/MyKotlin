package com.cbb.kotlin03

import java.io.File

/**
 * takeif
 * 和其他标准函数有点不一样，takelf函数需要判断lambda中提供的条件表达式，给出true或false结果，
 * 如果判断结果是true，从takelf函数返回接收者对象，
 * 如果是false，则返回null。
 * 如果需要判断某个条件是否满足，再决定是否可以赋值变量或执行某项任务，takelf就非常有用，
 * 概念上讲，takelf函数类似于if语句，但它的优势是可以直接在对象实例上调用,避免了临时变量赋值的麻烦。
 */
fun main() {

    var file = File("D://i have a dream_copy.txt")
        .takeIf { it.exists() && it.canRead() }
        ?.readText()
    println(file)
}