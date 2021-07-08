package com.cbb.kotlin02

/**
 * 函数类型与隐式返回
 *
 * 匿名函数也有类型，匿名函数可以当做变量赋值给函数类型变量。
 * 就像其他变量一样，匿名函数就可以在代码中传递了。
 * 变量有类型，变量可以等于函数，函数也会有类型。
 * 函数的类型，由传入的参数和返回值类型决定。
 *
 * 和具名函数不一样，除了极少数情况下，匿名函数不需要return关键字来返回数据，
 * 匿名函数会隐式或自动返回函数体最后一行语句的结果。
 *
 */
fun main() {
    //变量的类型是一个匿名函数
    val blessingFunction:()->String = {
        val hoppy = "New Year"
        "Happy $hoppy"
    }
    println(blessingFunction())
}