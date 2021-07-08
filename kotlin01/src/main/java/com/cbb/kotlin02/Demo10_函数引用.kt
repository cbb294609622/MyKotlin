package com.cbb.kotlin02

/**
 * 函数引用
 * 要把函数作为参数传给其他函数使用，除了传lambda表达式。
 * kotlin还提供了其他方法，传递函数引用。
 * 函数引用可以把一个具名函数转换成一个值参，使用lambda表达式的地方，都可以使用函数引用。
 */
fun main() {
    showShopping("牙膏",::getDiscountWords)
}

fun getDiscountWords(goodName:String,hour:Int):String {
    val currentYear = 2027
    return "${currentYear}年，双11${goodName}促销倒计时：${hour}小时"
}

fun showShopping(goodName:String,getDiscountWords:(String,Int) -> String){
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodName,hour))
}