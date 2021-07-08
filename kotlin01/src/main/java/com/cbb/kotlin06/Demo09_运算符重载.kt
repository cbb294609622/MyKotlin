package com.cbb.kotlin06

/**
 * 运算符重载
 * 如果要将内置运算符应用在自定义类身上，
 * 你必须重写运算符函数，告诉编译器如何操作自定义类
 *
 */
data class Demo(
    var x: Int,
    var y: Int
) {
    val isInBounds = x > 0 && y > 0
    operator fun plus(other: Demo) = Demo(x + other.x, y + other.y)
}

fun main() {
    val c1 = Demo(10, 20)
    val c2 = Demo(10, 20)
    println(c1+c2)

}