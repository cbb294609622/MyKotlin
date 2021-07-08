package com.cbb.kotlin03

import java.lang.Exception

/**
 * 自定义异常
 * 抛出异常
 * 捕获异常
 */
fun main() {
    var number:Int?=null
    try {
        checkOperation(number)
        number!!.plus(1)
    }catch (e:Exception){
        println(e)
    }
}

fun checkOperation(number:Int?){
//    number ?:throw UnskilledException()
    checkNotNull(number,{"something is not good"})
}


//自定义异常
class UnskilledException():IllegalArgumentException("操作不当")