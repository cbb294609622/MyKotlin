package com.cbb.kotlin01

/**
 * string模板
 * 模板支持在字符串的引号内放入变量值
 * 还支持字符串里计算表达式的值并插入结果，
 * 添加在${}中的任何表达式，都会作为字符串的一部分求值。
 */
fun main() {
    val str1 = "JECK"
    val str2 = "Rose"
    println("$str1 love $str2")

    val flag = false
    println("answer is: ${if (flag) "我可以" else "对不起"} ")


}