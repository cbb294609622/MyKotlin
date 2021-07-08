package com.cbb.kotlin01

/**
 * 1.
 * val 表示只读变量，不能修改
 * var 表示可以修改
 * 2.
 * 查看编译字节码文件
 *  按下 shift shift
 *  输入 show kotlin
 * 3.
 * kotlin的引用类型与基本数据类型
 *  java有两种数据类型
 *      引用类型
 *      基本数据类型
 *  kotlin只提供了引用类型这一种数据类型，出于更高性能的需要，
 *  kotlin编译器会在java字节码中改变基本数据类型。
 *
 */

//声明编译时 常亮
const val MAX = 200

fun main() {
    var a = 5
    println(a)
}