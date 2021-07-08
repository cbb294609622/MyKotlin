package com.cbb.kotlin06

/**
 * 对象表达式
 *  有时候你不一定非要定义一个新的命名类不可，也许你需要某个现有类的一种变体实例，
 *  但只需用一次就行了。事实上，对于这种用完就丢的类实例，连命名都可以省了，
 *  这个对象表达式是XX的子类。
 *  这个匿名类依然遵循object关键字的一个规则。
 *  即一旦实例化，该匿名类只能有唯一一个实例存在。
 */
open class P1{
    open fun load() = "loading nothing"
 }


fun main() {

    val p = object : P1() {
        override fun load() = "anonymouse nothing..."
    }
    println(p.load())
}