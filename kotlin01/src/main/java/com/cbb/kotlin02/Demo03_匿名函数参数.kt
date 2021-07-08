package com.cbb.kotlin02

/**
 * 匿名函数参数
 * 和具名函数一样，匿名函数可以不带参数，也可以带一个或多个任何类型的参数。
 * 需要带参数时，参数的类型放在匿名函数的类型定义中，参数名则放在函数定义中。
 */
fun main() {
    val str:(String) -> String = {name ->
        val holiday = "New Year"
        "$name ,Happy $holiday"
    }
    println(str("Jeak"))
}
