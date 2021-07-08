package com.cbb.kotlin03

/**
 * let
 *
 * let函数能使某个变量作用于其lambda表达式里，让it关键字能引用它，
 * let与apply比较。let会把接收者传给lambda，而apply什么都不传。
 * 匿名函数执行完，apply会返回当前接收者，而let会返回lambda的最后一行。
 *
 */
fun main() {

    val result = listOf(3,2,1).first().let {
        it*it
    }
    println(result)

    println(formatGreeting("null"))
}

fun formatGreeting(guestName:String?):String{
    return guestName?.let {
        "Welcome,$it."
    }  ?: "what's your name"
}