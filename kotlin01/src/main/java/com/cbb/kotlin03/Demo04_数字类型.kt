package com.cbb.kotlin03

import kotlin.math.roundToInt

/**
 * 和java一样，kotlin中所有数字类型都是有符号的。
 * 也就是说既可以表示正数，也可以表示负数。
 */
fun main() {
//    val number :Int = "8.9".toInt() //报错
    val number : Int? = "8.98".toIntOrNull()
    println(number)

    //double转int
    println(8.98787.toInt())//丢失经度
    println(8.98787.roundToInt())//四舍五入

    //double转字符串
    val s = "%.2f".format(8.9898)
    println(s)
}