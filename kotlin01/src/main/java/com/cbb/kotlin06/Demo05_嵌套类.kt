package com.cbb.kotlin06

/**
 * 嵌套类
 * 如果一个类只对另一个类有用，那么将其嵌入到该类中并使这两个类保持在一起是合乎逻辑的。
 * 可以使用嵌套类。
 */

class P3{
    class Equip(var name:String){
        fun show() = println("equip:$name")
    }
    fun battle(){

    }
}

fun main() {
    P3.Equip("sharp AK47").show()
}