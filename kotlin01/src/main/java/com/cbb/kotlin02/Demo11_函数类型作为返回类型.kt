package com.cbb.kotlin02

/**
 * 函数类型作为返回类型。
 */

fun main() {
//    val configDiscountWords:(String) -> String  = configDiscountWords()
    //获取返回的函数类型
    val configDiscountWords = configDiscountWords()
    //实际调用返回的函数类型进行函数传递参数。
    println(configDiscountWords("沐浴露"))
}

fun configDiscountWords():(String) -> String {
    val year = 2028
    val hour = (1..24).shuffled().last()
    return {goodName:String ->
        "${year}年，双11${goodName}商品大促销，剩余时间${hour}小时"
    }
}