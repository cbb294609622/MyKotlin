package com.cbb.kotlin06

/**
 * 枚举类
 * 用来定义常量集合的一种特殊类
 */

data class Demo1(
    var x: Int,
    var y: Int
) {
    val isInBounds = x > 0 && y > 0
}

enum class Direction2(private val demo: Demo1) {
    EAST(Demo1(1, 0)),
    WEST(Demo1(-1, 0)),
    SOUTH(Demo1(-1, 0)),
    NORTH(Demo1(1, 0));

    fun updateDemo(d: Demo1) = Demo(d.x + demo.x, d.y + demo.y)
}

fun main() {
    println(Direction2.EAST.updateDemo(Demo1(10,20)))
    println(Direction2.WEST.updateDemo(Demo1(0,0)))
}