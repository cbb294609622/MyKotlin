package com.cbb.kotlin07


/**
 * 定义扩展文件
 * 扩展函数需要在多个文件里面使用，可以将它定义在单独的文件，
 * 然后import
 */
fun <T> Iterable<T>.randomTake() :T = this.shuffled().first()

fun main() {
    var listOf = listOf("Jason", "jack", "Tom")
    listOf.randomTake()
}