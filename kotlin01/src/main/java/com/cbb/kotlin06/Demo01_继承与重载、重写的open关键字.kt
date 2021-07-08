package com.cbb.kotlin06

/**
 * 继承
 * 类默认都是封闭的，要让某个类开放继承，必须使用open关键字修饰它
 * A 继承 B  需要 在B的类上加入 open
 * A 重写 B 的方法，需要在A 重写的方法上写 override修饰，并且在B的被重写方法上加上 open修饰
 *
 * 重载与重写
 * 重载 是在一个类里面，方法名相同，参数不同    返回值可以不同  异常可以修改
 * 重写 子类、接口、实现，方法名相同，参数名相同  返回值相同   不可修改
 *
 */

open class Product(
    var name:String
){
    fun description() = "Product: $name"
    open fun load() = "Product load"
}

class Shopping :Product("jack"){
    override fun load() = "Shopping load"
}



fun main() {
    val p:Product = Shopping()
    println(p.load())//Shopping load
}