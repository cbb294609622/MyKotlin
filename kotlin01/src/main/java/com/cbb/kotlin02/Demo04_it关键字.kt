package com.cbb.kotlin02

/**
 * it 关键字
 * 定义只有一个参数的匿名函数时，可以使用it关键字来表示参数名。
 * 当你需要传入两个值参，it关键字就不能用了。
 */
fun main() {
    var str:(String) -> String = {
        "$it,Happy New Year"
    }
    println(str("Marry"))

}