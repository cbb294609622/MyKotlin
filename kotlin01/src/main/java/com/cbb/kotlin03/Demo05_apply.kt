package com.cbb.kotlin03

import java.io.File

/**
 * apply
 *
 * 可以看到，调用一个个函数类配置接收者时，变量名就省掉了，
 * 这是因为，在lambda表达式里，apply能让每一个配置函数都作用与接收者，
 * 这种行为有时又叫做相关作用域。
 * 因为lambda表达式里的所有函数调用都是针对接收者的，或者说，他们是针对接收者的隐式调用。
 *
 */

fun main() {
    val file1 = File("E://i have a dream_copy.txt")
    file1.setReadable(true)
    file1.setWritable(true)
    file1.setExecutable(false)

    val file2 = File("E://i have a dream_copy.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }



}