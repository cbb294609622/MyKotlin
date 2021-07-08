package com.cbb.kotlin07


/**
 * 可空类扩展
 * 你也可以定义扩展函数用于可空类型，在可空类型上定义扩展函数，
 * 你就可以直接在扩展函数体内解决可能出现的空值问题。
 */

infix fun String?.printWithDefault(default:String) = println(this ?:default)

fun main() {
    val nulllableString:String? = "efg"
    nulllableString.printWithDefault("abc")

    val nulllableString1:String? = null
    nulllableString1.printWithDefault("abc")

}