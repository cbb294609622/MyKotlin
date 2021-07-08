package com.cbb.kotlin02

/**
 * 函数的参数是另一个函数
 */
fun main() {
    val getDiscountWords = {goodName:String,hour:Int ->
        val currentYear = 2027
        "${currentYear}年，双11${goodName}促销倒计时：${hour}小时"
    }

    showOnBoard("卫生纸",getDiscountWords)
}

fun showOnBoard(goodsName:String,getDiscountWords:(String,Int) ->String){
    val hours = (1..24).shuffled().last()
    println(getDiscountWords(goodsName,hours))
}