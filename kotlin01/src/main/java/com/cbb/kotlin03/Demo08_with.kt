package com.cbb.kotlin03

/**
 * with
 * with函数是run的变体，他们的功能行为是一样的，但是with的调用方式不同，
 * 调用with是需要值参作为其第一个参数传入。
 */
fun main(){
    val res1 = "what your name of good".run {
        length >= 10
    }
    val res2 = with("what your name of good") {
        length >= 10
    }

    println(res1)
    println(res2)

}