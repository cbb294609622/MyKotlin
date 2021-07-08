package com.cbb.kotlin01

/**
 * kotlin 可以使用空格和特殊字符对函数命名，不过函数名要用一对反引号括起来
 * 为了支持kotlin和java互操作，而kotlin和java各自却有着不同的保留关键字。
 * 不能作为函数名，使用反引号扩住函数名就能避免任何冲突。
 */
fun main() {
    `is`()

    Demo08.`is`()
}

fun `is`(){
    println("waka")
}

