package com.cbb.kotlin06

import java.io.File

/**
 * 伴生对象
 * 如果你想将某一个对象的初始化和一个类实例捆绑在一起。
 * 可以考虑伴生对象，使用companion修饰符。
 * 你可以在一个类定义里面声明一个伴生对象，
 * 一个类里面只能有一个伴生对象。
 *
 * 静态的意思，使用时，在初始化
 */
open class P2{
    companion object{
        private const val PATH = "XXX"
        fun load() = File(PATH).readBytes()
    }
 }


fun main() {

    P2.load()
}