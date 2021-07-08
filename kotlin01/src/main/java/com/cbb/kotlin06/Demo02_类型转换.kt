package com.cbb.kotlin06

import java.io.File

/**
 * 类型转换 as
 *
 * 智能类型转换
 * kotlin编译器很聪明，只要确定any is 父类条件检测属实，它就会将any当做子类类型对待。
 * 因此，编译器允许你不经类型转换直接使用
 *
 * java 中 类的超类 是Object
 * kotlin中类的超累是Any
 *
 */

open class A(
    var name:String
){
    fun description() = "Product: $name"
    open fun load() = "Product load"
}

class B :A("jack"){
    override fun load() = "Shopping load"
    fun special() = "B Bbbbbb"
}



fun main() {
    val p:A = B()

    //类型检测
    println(p is A)
    println(p is B)
    println(p is File)

    //类型判断
    if (p is B){
        //类型转换
        val s = (p as B).special()
        println(s)
        println(p.special())    //转换一次后，后续可以一直使用
    }

    println(p is Any)


}