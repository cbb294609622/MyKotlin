package com.cbb.kotlin03

import java.io.File

/**
 * takeUnless
 * takeif辅助函数takeUnless，只有判断你给定的条件结果是false时，
 * takeUnless才会返回原始接收者对象。
 */
fun main() {

    var file = File("D://i have a dream_copy.txt")
        .takeUnless { it.isHidden }
        ?.readText()
    println(file)
}