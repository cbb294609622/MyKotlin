package com.cbb.kotlin02

/**
 * 简略写法
 * 如果一个函数的lambda参数排在最后，或者是唯一的参数，那么括住lambda值参的一对圆括号可以省略。
 *
 *
 */
fun main() {
    val total = "asadasasd1aadas".count({letter ->
        letter == 's'
    })

    val total1 = "asadasasd1aadas".count{letter ->
        letter == 's'
    }

    val total2 = "asadasasd1aadas".count{it
        it == 's'
    }
    //简略写法
    val total3 = "asadasasd1aadas".count{it == 's'}

//    var getDiscountWords = {goodName:String,hour:Int ->
//        val currentYear = 2027
//        "${currentYear}年，双11${goodName}促销倒计时：${hour}小时"
//    }

    //简略写法
    showShop("方便面"){goodName:String,hour:Int ->
        val currentYear = 2027
        "${currentYear}年，双11${goodName}促销倒计时：${hour}小时"
    }
}

fun showShop(goodName:String,getDiscountWords:(String,Int) -> String){
   val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodName,hour))
}