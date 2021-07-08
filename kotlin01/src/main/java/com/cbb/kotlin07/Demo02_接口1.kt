package com.cbb.kotlin07

/**
 * 接口
 * kotlin规定所有的接口属性和函数实现都要使用override关键字。
 * 接口中定义的函数并不需要open关键字修饰。他们默认就是open
 */
interface Move1{
    val maxSpeed:Int
        get() = (1..500).shuffled().last()
    var wheels:Int
    fun move(m:Move):String
}

class Car1(_name:String,
          override var wheels:Int = 4):Move1{
    override var maxSpeed: Int
        get() = super.maxSpeed  //使用接口中get
        set(value) {}

    override fun move(m: Move): String {
        TODO("Not yet implemented")
    }

}

fun main() {

}